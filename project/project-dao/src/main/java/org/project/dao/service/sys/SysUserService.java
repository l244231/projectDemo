/*
 * @(#)SysUserService.java
 * Author : Zain.Luo
 * Created Date: 2016年11月14日 
 */
package org.project.dao.service.sys;

import java.util.List;
import org.project.dao.domain.SysUserDTO;

/**
 * @title 系统用户相关操作service类
 * @author Zain.Luo
 * @version 1.0<br>
 * @history<br>
 * 				2016年11月14日 Zain.Luo create file<br>
 *              Id:SysUserService.java,v1.0 2016年11月14日 下午5:04:35
 */
public interface SysUserService {

	public List<SysUserDTO> querySysUser();
}
