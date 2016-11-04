/*
 * @(#)TestController.java
 * Author : Zain.Luo
 * Created Date: 2016年11月2日 
 */
package com.main.project.controller.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @title 测试类
 * @author Zain.Luo
 * @version 1.0<br>
 * @history<br>
 * 				2016年11月2日 Zain.Luo create file<br>
 *              Id:TestController.java,v1.0 2016年11月2日 下午4:33:17
 */
@Controller
public class TestController {

	@RequestMapping("test.do")
	public String testController(HttpServletRequest request, HttpServletResponse resopnse) {
		System.out.println("Hello World");
		 
		return "index";
	}
}
