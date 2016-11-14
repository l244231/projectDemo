/*
 * @(#)SysUser.java
 * Author : Zain.Luo
 * Created Date: 2016年11月14日 
 */
package org.project.dao.domain;

import java.util.Date;

/**
 * @title 系统用户类
 * @author Zain.Luo
 * @version 1.0<br>
 * @history<br>
 * 				2016年11月14日 Zain.Luo create file<br>
 *              Id:SysUser.java,v1.0 2016年11月14日 下午4:39:59
 */
public class SysUserDTO {
	/**
	 * 主键ID
	 */
	private String id;

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 创建人
	 */
	private String createdUser;

	/**
	 * 创建时间
	 */
	private Date createdDate;

	/**
	 * 更新人
	 */
	private String updateUser;

	/**
	 * 更新时间
	 */
	private Date updateDate;

	/**
	 * 是否有效
	 */
	private String isVaild;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getIsVaild() {
		return isVaild;
	}

	public void setIsVaild(String isVaild) {
		this.isVaild = isVaild;
	}

}
