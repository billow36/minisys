package com.ocean.sys.repair;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * 修复页面
 * @author OCEAN
 *
 */
@Controller
@RequestMapping(value = "/repair")
public class RepairController {
	@Autowired
	private RepairDataService repairService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String repairForm() {
		
		repairService.DeleteAll();
		return "repair/init";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String fail(@RequestParam(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM) String userName, Model model) {
		return "repair/init";
	}
	
	@RequestMapping(value = "info")
	public String info() {
		System.out.println("进入初始化");
		return "repair/init";
	}

}
