/*
 * @(#)Test.java
 * Author : Zain.Luo
 * Created Date: 2016年11月14日 
 */
package org.project.dao;

import java.util.List;

import javax.annotation.Resource;

import org.project.dao.domain.SysUserDTO;
import org.project.dao.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @title TODO
 * @author Zain.Luo
 * @version 1.0<br>
 * @history<br>
 * 				2016年11月14日 Zain.Luo create file<br>
 *              Id:Test.java,v1.0 2016年11月14日 下午5:54:10
 */
public class Test {
	@Resource
	private SysUserService sysUserService;

	@org.junit.Test
	public void test() {

		List<SysUserDTO> dto = sysUserService.querySysUser();
		System.out.println(dto.get(0).getId());
	}
}
