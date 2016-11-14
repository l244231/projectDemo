/*
 * @(#)SysUserDao.java
 * Author : Zain.Luo
 * Created Date: 2016年11月14日 
 */
package org.project.dao.dao.sys;

import java.util.List;

import org.project.dao.domain.SysUserDTO;

/**
 * @title 系统用户相关操作DAO类 
 * @author Zain.Luo
 * @version 1.0<br>
 * @history<br>
 * 2016年11月14日 Zain.Luo create file<br>
 * Id:SysUserDao.java,v1.0 2016年11月14日 下午4:51:17
 */
public interface SysUserDao {
	public List<SysUserDTO> querySysUser();
}
