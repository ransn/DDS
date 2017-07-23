/**
 * 
 */
package com.dds.serviceImpl;

import java.util.List;

import com.dds.hdl.beans.ModuleDetail;
import com.dds.hdl.dao.DDSServiceDao;
import com.dds.service.DDSService;

/**
 * @author I326319
 *
 */
public class DDSServiceImpl implements DDSService {

	@Override
	public List<ModuleDetail> getAllModuleDetails() {
		DDSServiceDao ddsServiceDao = new DDSServiceDao();
		return ddsServiceDao.getAllModuleDetails();
	}

}
