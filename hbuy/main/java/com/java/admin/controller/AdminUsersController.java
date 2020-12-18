package com.java.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import com.java.admin.model.AdminUsersEntity;
 
/**
 * 
 * @author djin
 *   AdminUsers控制器
 * @date 2019-09-18 15:17:59
 */
@Controller
@RequestMapping("/adminusers")
public class AdminUsersController extends BaseController<AdminUsersEntity>{
	
	/**
	 * 页面jsp
	 */
	@RequestMapping("/page")
	public String page(){
		return "adminusers";
	}

    /**
     * 页面html
     */
    @RequestMapping("/html")
    public String html(){
        return "redirect:/html/adminusers.html";
    }
}
