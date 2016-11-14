/*
 * @(#)BaseController.java
 * Author : Zain.Luo
 * Created Date: 2016年11月11日 
 */
package com.project.web.controller.Base;

import javax.servlet.http.HttpServletRequest;

/**
 * @title 基础controller类
 * @author Zain.Luo
 * @version 1.0<br>
 * @history<br>
 * 				2016年11月11日 Zain.Luo create file<br>
 *              Id:BaseController.java,v1.0 2016年11月11日 上午11:07:51
 */
public class BaseController {
	/** 
	* @Title: getParameter 
	* @author: Zain.Luo
	* @Description: 根据参数名，获取前台传入参数值
	* @param request
	* @param parameterName
	* @return    
	* @return String    
	* @throws 
	* @history: 2016年11月11日 created
	*/
	public String getParameter(HttpServletRequest request, String parameterName) {
		return request.getParameter(parameterName);
	}
}
