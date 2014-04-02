package com.ocean.sys.web.account;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * LoginController负责打开登录页面(GET请求)和登录出错页面(POST请求)，
 * 
 * 真正登录的POST请求由Filter完成,
 * 
 * @author calvin
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {


	
	@RequestMapping(method = RequestMethod.GET)
	public String login() {

		System.out.println("-------------执行LoginControll----------");
		return "account/login";
		
	}

	@RequestMapping(method = RequestMethod.POST)
	public String login(String username,String password, Model model) {
		try {
			System.out.println("------------用户名-----------"+username);
			System.out.println("------------密码-----------"+password);
			model.addAttribute(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM, username);
			//使用权限工具进行用户登录，登录成功后跳到shiro配置的successUrl中，与下面的return没什么关系！
			SecurityUtils.getSubject().login(new UsernamePasswordToken(username, password));
			return "sys/index";
		} catch (AuthenticationException e) {
			return "account/login";
		}
	}
	@RequestMapping(value="/logout",method=RequestMethod.GET)  
    public String logout(RedirectAttributes redirectAttributes ){ 
		//使用权限管理工具进行用户的退出，跳出登录，给出提示信息
        SecurityUtils.getSubject().logout();  
        redirectAttributes.addFlashAttribute("message", "您已安全退出");  
        return "redirect:/login";
    } 

}
