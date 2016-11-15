/*
 * @(#)SysUserServiceImpl.java
 * Author : Zain.Luo
 * Created Date: 2016年11月14日 
 */
package org.project.dao.service.sys.impl;

import java.util.List;

import org.project.dao.dao.sys.SysUserDao;
import org.project.dao.domain.SysUserDTO;
import org.project.dao.service.sys.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @title TODO
 * @author Zain.Luo
 * @version 1.0<br>
 * @history<br>
 * 				2016年11月14日 Zain.Luo create file<br>
 *              Id:SysUserServiceImpl.java,v1.0 2016年11月14日 下午5:06:23
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserDao dao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.project.service.SysUserService#querySysUser()
	 */
	@Override
	public List<SysUserDTO> querySysUser() {
		return dao.querySysUser();
	}

}
