/**
 * 
 */
package com.dds.hdl.beans;

/**
 * @author I326319
 *
 */
public class TableDetail {
	private int tableId;
	private String tableName;
	private int moduleId;
	private TableConfigurationDetail tableConfigDetail;
	
	public TableConfigurationDetail getTableConfigDetail() {
		return tableConfigDetail;
	}
	public void setTableConfigDetail(TableConfigurationDetail tableConfigDetail) {
		this.tableConfigDetail = tableConfigDetail;
	}
	public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
}
