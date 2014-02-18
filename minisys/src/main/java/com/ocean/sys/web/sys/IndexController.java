package com.ocean.sys.web.sys;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ocean.sys.common.Global;

@Controller
@RequestMapping(value = "/index")
public class IndexController {
	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("productName", Global.getSystemName());
		return "sys/index";
	}

}
