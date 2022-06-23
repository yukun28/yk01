package com.java.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import com.java.admin.model.AdminUserAuthorityEntity;
 
/**
 * 
 * @author djin
 *   AdminUserAuthority控制器天天爱彩票
 *   是不错票    的历历可见
 * @date 2019-09-18 15:17:59
 */
@Controller
@RequestMapping("/adminuserauthority")
public class AdminUserAuthorityController extends BaseController<AdminUserAuthorityEntity>{
	
	/**
	 * 页面jsp
	 */
	@RequestMapping("/page")
	public String page(){
		return "adminuserauthority";
	}

    /**
     * 页面html
     */
    @RequestMapping("/html")
    public String html(){
        return "redirect:/html/adminuserauthority.html";
    }
}
