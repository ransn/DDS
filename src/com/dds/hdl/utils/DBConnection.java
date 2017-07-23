/**
 * 
 */
package com.dds.hdl.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.dds.hdl.beans.ConnectionDetail;

/**
 * @author I326319
 *
 */
public class DBConnection {
	//private static final String URL = "jdbc:sap://10.79.21.116:30015?reconnect=true";
	//private static final String URL = "jdbc:sap://10.116.84.136:30215?reconnect=true";
	/*private static final String USERNAME = "WSTSERVICE";
	private static final String PASSWORD = "Bne2blr!%";*/
	//private static final String USERNAME = "SNRAN";
	//private static final String PASSWORD = "welcome1";
	private ConnectionDetail connectionDetail;
	
	public DBConnection(ConnectionDetail connectionDetail) {
		super();
		this.connectionDetail = connectionDetail;
	}

	public Connection getConnection() throws Exception {
		Class.forName("com.sap.db.jdbc.Driver");
		return DriverManager.getConnection(connectionDetail.getUrl(), connectionDetail.getUserName(), connectionDetail.getPassword());
	}
	
	public void closeConnection(Connection con, Statement stmt)
			throws Exception {
		if (stmt != null) {
			stmt.close();
		}
		if (con != null) {
			con.close();
		}
	}
}
