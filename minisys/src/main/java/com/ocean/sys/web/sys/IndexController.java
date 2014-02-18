package com.ocean.sys.web.sys;

import java.util.Map;

import javax.servlet.ServletRequest;
import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ocean.sys.entity.RbacUser;
import com.ocean.sys.entity.RbacTask;
import com.ocean.sys.service.account.ShiroDbRealm.ShiroUser;
import com.ocean.sys.service.task.TaskService;

import org.springside.modules.web.Servlets;

import com.google.common.collect.Maps;

@Controller
@RequestMapping(value = "/index")
public class IndexController {

	
	@Autowired
	private TaskService taskService;

	@RequestMapping(method = RequestMethod.GET)
	public String list() {
		System.out.println("进入导航功能");
		return "sys/index";
	}

}
