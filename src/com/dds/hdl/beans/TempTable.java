/**
 * 
 */
package com.dds.hdl.beans;

/**
 * @author I326319
 *
 */
public class TempTable {
	private int id;
	private int moduleId;
	private int tableId;
	private String dataString;
	private String dataTypeString;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	public String getDataString() {
		return dataString;
	}
	public void setDataString(String dataString) {
		this.dataString = dataString;
	}
	public String getDataTypeString() {
		return dataTypeString;
	}
	public void setDataTypeString(String dataTypeString) {
		this.dataTypeString = dataTypeString;
	}
	
	
}
