/*
 * @(#)SysUserDaoImpl.java
 * Author : Zain
 * Created Date: 2016年11月14日 
 */
package org.project.dao.dao.sys.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.project.dao.dao.sys.SysUserDao;
import org.project.dao.domain.SysUserDTO;
import org.springframework.stereotype.Repository;

/**
 * @title TODO 
 * @author Zain
 * @version 1.0<br>
 * history<br>
 * 2016年11月14日 Zain create file<br>
 * Id:SysUserDaoImpl.java,v1.0 2016年11月14日 下午9:42:11
 */
@Repository("sysUserDao")
public class SysUserDaoImpl extends SqlSessionDaoSupport implements SysUserDao {

	/* (non-Javadoc)
	 * @see org.project.dao.dao.sys.SysUserDao#querySysUser()
	 */
	@Override
	public List<SysUserDTO> querySysUser() {
		this.getSqlSession().selectList("querySysUser");
		return null;
	}

}
