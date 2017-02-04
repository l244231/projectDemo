/*
 * @(#)BaseDao.java
 * Author : Zain.Luo
 * Created Date: 2017年2月4日 
 */
package com.project.dao.common.dao;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.project.dao.common.domain.BaseEntity;

/**
 * @title 基础Dao接口 
 * @author Zain.Luo
 * @version 1.0<br>
 * @history<br>
 * 2017年2月4日 Zain.Luo create file<br>
 * Id:BaseDao.java,v1.0 2017年2月4日 上午11:18:24
 */ 
public interface BaseDao<T extends BaseEntity> {

	/**
	 * @Title: findById
	 * @author: Zain.Luo
	 * @Description: 根据ID查询对应实体的信息
	 * @param id
	 * @return T
	 * @throws @history:
	 *             2017年2月4日 created
	 */
	public T findById(String id);

	/**
	 * @Title: findAll
	 * @author: Zain.Luo
	 * @Description: 查询全部信息
	 * @return List<T>
	 * @throws @history:
	 *             2017年2月4日 created
	 */
	public List<T> findAll();

	/**
	 * @Title: findAllByEntity
	 * @author: Zain.Luo
	 * @Description: 通过实体，查询数据
	 * @param dto
	 *            实体
	 * @return List<T>
	 * @throws @history:
	 *             2017年2月4日 created
	 */
	public List<T> findAllByEntity(T dto);

	/**
	 * @Title: findAllByParams
	 * @author: Zain.Luo
	 * @Description: 通过参数查询对应数据
	 * @param params
	 *            参数
	 * @return List<T>
	 * @throws @history:
	 *             2017年2月4日 created
	 */
	public List<T> findAllByParams(Map params);

	/**
	 * @Title: findPageByEntity
	 * @author: Zain.Luo
	 * @Description: 通过实体查询数据，分页
	 * @param dto
	 * @return List<T>
	 * @throws @history:
	 *             2017年2月4日 created
	 */
	public List<T> findPageByEntity(T dto);

	/**
	 * @Title: findPageByParams
	 * @author: Zain.Luo
	 * @Description: 通过参数查询数据，分页
	 * @param params
	 * @return List<T>
	 * @throws @history:
	 *             2017年2月4日 created
	 */
	public List<T> findPageByParams(Map params);

	/**
	 * @Title: queryAll
	 * @author: Zain.Luo
	 * @Description: 查询所有数据
	 * @return List<Map>
	 * @throws @history:
	 *             2017年2月4日 created
	 */
	public List<Map> queryAll();

	/**
	 * @Title: queryAllByEntity
	 * @author: Zain.Luo
	 * @Description: 通过实体查询数据
	 * @param dto
	 * @return LIst<Map>
	 * @throws @history:
	 *             2017年2月4日 created
	 */
	public List<Map> queryAllByEntity(T dto);

	/**
	 * @Title: queryAllByParams
	 * @author: Zain.Luo
	 * @Description: 通过传参查询数据
	 * @param params
	 * @return List<Map>
	 * @throws @history:
	 *             2017年2月4日 created
	 */
	public List<Map> queryAllByParams(Map params);

	/**
	 * @Title: queryPageByEntity
	 * @author: Zain.Luo
	 * @Description: 通过实体查询所有数据，分页
	 * @param dto
	 * @return
	 * @return List<Map>
	 * @throws @history:
	 *             2017年2月4日 created
	 */
	public List<Map> queryPageByEntity(T dto);

	/**
	 * @Title: queryPageByParams
	 * @author: Zain.Luo
	 * @Description: 通过参数查询数据，分布
	 * @param params
	 * @return
	 * @return List<Map>
	 * @throws @history:
	 *             2017年2月4日 created
	 */
	public List<Map> queryPageByParams(Map params);

	/**
	 * @Title: deleteById
	 * @author: Zain.Luo
	 * @Description: 通过ID删除数据
	 * @param id
	 * @return int
	 * @throws @history:
	 *             2017年2月4日 created
	 */
	public int deleteById(String id);

	/**
	 * @Title: deleteByEntity
	 * @author: Zain.Luo
	 * @Description: 通过实体删除数据
	 * @param dto
	 * @return int
	 * @throws @history:
	 *             2017年2月4日 created
	 */
	public int deleteByEntity(T dto);

	/**
	 * @Title: deleteByParams
	 * @author: Zain.Luo
	 * @Description: 通过参数删除数据
	 * @param params
	 * @return int
	 * @throws @history:
	 *             2017年2月4日 created
	 */
	public int deleteByParams(Map params);

	/**
	 * @Title: updateByEntity
	 * @author: Zain.Luo
	 * @Description: 通过实体更新数据
	 * @param dto
	 * @return int
	 * @throws @history:
	 *             2017年2月4日 created
	 */
	public int updateByEntity(T dto);

	/**
	 * @Title: updateByParams
	 * @author: Zain.Luo
	 * @Description: 通过参数更新数据
	 * @param params
	 * @return
	 * @return int
	 * @throws @history:
	 *             2017年2月4日 created
	 */
	public int updateByParams(Map params);

	/**
	 * @Title: countByEntity
	 * @author: Zain.Luo
	 * @Description: 通过实体计数
	 * @param dto
	 * @return int
	 * @throws @history:
	 *             2017年2月4日 created
	 */
	public int countByEntity(T dto);

	/**
	 * @Title: countByParams
	 * @author: Zain.Luo
	 * @Description: 通过参数计数
	 * @param params
	 * @return int
	 * @throws @history:
	 *             2017年2月4日 created
	 */
	public int countByParams(Map params);
}
