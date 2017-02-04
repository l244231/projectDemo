/*
 * @(#)TestController.java
 * Author : Zain.Luo
 * Created Date: 2017年2月4日 
 */
package com.project.web.controller.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.dao.demo.domain.SysUserDto;
import com.project.dao.demo.service.SysUserService;

/**
 * @title TODO
 * @author Zain.Luo
 * @version 1.0<br>
 * @history<br>
 * 				2017年2月4日 Zain.Luo create file<br>
 *              Id:TestController.java,v1.0 2017年2月4日 下午3:21:53
 */
@Controller
@RequestMapping("/demo/test")
public class TestController {
	private Logger logger = LogManager.getLogger("baseLogger");
	
	@Autowired
	private SysUserService sysUserService;

	@RequestMapping("test")
	public void testController(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("test");
	}

	@RequestMapping("testDao")
	public void testDao(HttpServletRequest request, HttpServletResponse response) {
		List<SysUserDto> list = sysUserService.findAll();
		logger.debug("testLog4j");
		if(list != null && list.size() != 0){
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i).getUserName());
			}
		}
	}
}