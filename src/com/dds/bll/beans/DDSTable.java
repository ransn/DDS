/**
 * 
 */
package com.dds.bll.beans;

import java.util.HashMap;
import java.util.List;

/**
 * @author I326319
 *
 */
public class DDSTable {
	private List<String> keys;
	private int theta;
	private String idColumnName;
	private List<HashMap<String, String>> columnValueMap;
	private HashMap<String, Object> columnDataTypeMap;
	
	public List<String> getKeys() {
		return keys;
	}
	public void setKeys(List<String> keys) {
		this.keys = keys;
	}
	public int getTheta() {
		return theta;
	}
	public void setTheta(int theta) {
		this.theta = theta;
	}
	public String getIdColumnName() {
		return idColumnName;
	}
	public void setIdColumnName(String idColumnName) {
		this.idColumnName = idColumnName;
	}
	public List<HashMap<String, String>> getEntityData() {
		return columnValueMap;
	}
	public void setEntityData(List<HashMap<String, String>> entityData) {
		this.columnValueMap = entityData;
	}
	public HashMap<String, Object> getDataType() {
		return columnDataTypeMap;
	}
	public void setDataType(HashMap<String, Object> dataType) {
		this.columnDataTypeMap = dataType;
	}
	
}
