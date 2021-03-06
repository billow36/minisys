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
		System.out.println("进入get");
		return "repair/init";
	}
	@RequestMapping(value = "repairdb")
	public String repairdb() {
		repairService.DeleteAll();
		return "redirect:/login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String fail(@RequestParam(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM) String userName, Model model) {
		System.out.println("进入fail ---post");
		return "repair/init";
	}
	
	@RequestMapping(value = "info")
	public String info() {
		System.out.println("进入初始化");
		return "repair/init";
	}
	

}
