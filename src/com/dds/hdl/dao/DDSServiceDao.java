/**
 * 
 */
package com.dds.hdl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dds.hdl.beans.ConnectionDetail;
import com.dds.hdl.beans.ModuleDetail;
import com.dds.hdl.beans.TableConfigurationDetail;
import com.dds.hdl.beans.TableDetail;
import com.dds.hdl.utils.DBConnection;

/**
 * @author I326319
 *
 */
public class DDSServiceDao {
	public List<ModuleDetail> getAllModuleDetails(){
		ConnectionDetail connectionDetail = loadConnectionDetail();
		DBConnection dbConnection = new DBConnection(connectionDetail);
		String query = "select * from TEST_HANA.MODULE_DETAILS";
		List<ModuleDetail> moduleDetails = new ArrayList<>();
		try {
			Connection con = dbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				ModuleDetail moduleDetail = new ModuleDetail();
				int moduleId = rs.getInt("MODULE_ID");
				moduleDetail.setModuleId(moduleId);
				moduleDetail.setModuleName(rs.getString("MODULE_NAME"));
				List<TableDetail> tableDetailsList = getAllTableDetails(moduleId, con);
				moduleDetail.setTableDetails(tableDetailsList);
				moduleDetails.add(moduleDetail);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return moduleDetails;
	}

	private List<TableDetail> getAllTableDetails(int moduleId, Connection con) {
		List<TableDetail> tableDetailsList = new ArrayList<>();
		String query = "select * from TEST_HANA.TABLE_DETAILS where MODULE_ID = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, moduleId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				TableDetail tableDetail = new TableDetail();
				int tableId = rs.getInt("TABLE_ID");
				tableDetail.setTableId(tableId);
				tableDetail.setTableName(rs.getString("TABLE_NAME"));
				tableDetail.setModuleId(rs.getInt("MODULE_ID"));
				TableConfigurationDetail tableConfigDetail = getTableConfigDetail(tableId, con);
				tableDetail.setTableConfigDetail(tableConfigDetail);
				tableDetailsList.add(tableDetail);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return tableDetailsList;
	}

	private TableConfigurationDetail getTableConfigDetail(int tableId, Connection con) {
		TableConfigurationDetail tcd = new TableConfigurationDetail();
		String query = "select * from TEST_HANA.TABLE_CONFIG_DETAILS where TABLE_ID = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, tableId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				tcd.setId(rs.getInt("ID"));
				tcd.setKey(rs.getString("KEY"));
				tcd.setTheta(rs.getString("THETA"));			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tcd;
	}

	private ConnectionDetail loadConnectionDetail() {
		ConnectionDetail connectionDetail = new ConnectionDetail();
		connectionDetail.setUrl("jdbc:sap://10.116.84.136:30215?reconnect=true");
		connectionDetail.setUserName("WSTSERVICE");
		connectionDetail.setPassword("Bne2blr!%");
		return connectionDetail;
	}
}
