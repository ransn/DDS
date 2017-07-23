/**
 * 
 */
package com.dds.hdl.beans;

import java.util.List;

/**
 * @author I326319
 *
 */
public class ModuleDetail {
	private int moduleId;
	private String moduleName;
	private List<TableDetail> tableDetails;
	
	public List<TableDetail> getTableDetails() {
		return tableDetails;
	}
	public void setTableDetails(List<TableDetail> tableDetails) {
		this.tableDetails = tableDetails;
	}
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
}
