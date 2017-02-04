/*
 * @(#)SysUserDto.java
 * Author : Zain.Luo
 * Created Date: 2017年2月4日 
 */
package com.project.dao.demo.domain;

import com.project.dao.common.domain.BaseEntity;

/**
 * @title TODO 
 * @author Zain.Luo
 * @version 1.0<br>
 * @history<br>
 * 2017年2月4日 Zain.Luo create file<br>
 * Id:SysUserDto.java,v1.0 2017年2月4日 下午3:56:07
 */
public class SysUserDto extends BaseEntity{
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
