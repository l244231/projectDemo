/*
 * @(#)BaseEntity.java
 * Author : Zain.Luo
 * Created Date: 2017年2月4日 
 */
package com.project.dao.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @title TODO 
 * @author Zain.Luo
 * @version 1.0<br>
 * @history<br>
 * 2017年2月4日 Zain.Luo create file<br>
 * Id:BaseEntity.java,v1.0 2017年2月4日 上午11:20:36
 */
public class BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7308050276029918293L;
	
	/**
	 * 主键：ID
	 */
	private String id;
	
	/**
	 * 状态
	 */
	private String status;
	
	/**
	 * 创建时间
	 */
	private Date createdDate;
	
	/**
	 * 更新时间
	 */
	private Date updatedDate;
	
	/**
	 * 创建人
	 */
	private String createdUser;
	
	/**
	 * 更新人
	 */
	private String updatedUser;
	
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public String getUpdatedUser() {
		return updatedUser;
	}

	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}

	public String getIsVaild() {
		return isVaild;
	}

	public void setIsVaild(String isVaild) {
		this.isVaild = isVaild;
	}
	
}
