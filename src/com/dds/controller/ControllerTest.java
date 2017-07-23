/**
 * 
 */
package com.dds.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dds.hdl.beans.ModuleDetail;
import com.dds.hdl.beans.TableDetail;
import com.dds.service.DDSService;
import com.dds.serviceImpl.DDSServiceImpl;

/**
 * @author I326319
 *
 */
@Controller
public class ControllerTest {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
 		DDSService ddsService = new DDSServiceImpl();
 		List<ModuleDetail> modulesDetail = ddsService.getAllModuleDetails();
 		for(ModuleDetail md: modulesDetail){
 			System.out.println("ModuleId"+md.getModuleId());
 			System.out.println("ModuleName"+md.getModuleName());
 			for(TableDetail td: md.getTableDetails()){
 				System.out.println("TableId"+td.getTableId());
 				System.out.println("TableName"+td.getTableName());
 			}
 		}
 		return new ModelAndView("welcome", "message", message);
	}
}
