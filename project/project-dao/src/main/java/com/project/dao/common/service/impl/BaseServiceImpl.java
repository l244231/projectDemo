/*
 * @(#)BaseServiceImpl.java
 * Author : Zain.Luo
 * Created Date: 2017年2月4日 
 */
package com.project.dao.common.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.dao.common.dao.BaseDao;
import com.project.dao.common.domain.BaseEntity;
import com.project.dao.common.service.BaseService;

/**
 * @title 公共service实现类
 * @author Zain.Luo
 * @version 1.0<br>
 * @history<br>
 * 				2017年2月4日 Zain.Luo create file<br>
 *              Id:BaseServiceImpl.java,v1.0 2017年2月4日 下午2:39:15
 */
@Service("baseService")
public class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {

	@Autowired
	private BaseDao<T> baseDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.project.dao.common.service.BaseService#findById(java.lang.String)
	 */
	@Override
	public T findById(String id) {
		return baseDao.findById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.project.dao.common.service.BaseService#findAll()
	 */
	@Override
	public List<T> findAll() {
		return baseDao.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.project.dao.common.service.BaseService#findAllByEntity(org.project.
	 * dao.common.domain.BaseEntity)
	 */
	@Override
	public List<T> findAllByEntity(T dto) {
		return baseDao.findAllByEntity(dto);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.project.dao.common.service.BaseService#findAllByParams(java.util.Map)
	 */
	@Override
	public List<T> findAllByParams(Map params) {
		return baseDao.findAllByParams(params);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.project.dao.common.service.BaseService#findPageByParams(java.util.
	 * Map)
	 */
	@Override
	public PageInfo<T> findPageByParams(Map params) {
		// 分页
		PageHelper.startPage(Integer.parseInt(params.get("offset").toString()), Integer.parseInt(params.get("limit").toString()));
		PageInfo<T> page = new PageInfo<T>(baseDao.findPageByParams(params));
		return page;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.project.dao.common.service.BaseService#queryAll()
	 */
	@Override
	public List<Map> queryAll() {
		return baseDao.queryAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.project.dao.common.service.BaseService#queryAllByEntity(org.project.
	 * dao.common.domain.BaseEntity)
	 */
	@Override
	public List<Map> queryAllByEntity(T dto) {
		return baseDao.queryAllByEntity(dto);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.project.dao.common.service.BaseService#queryAllByParams(java.util.
	 * Map)
	 */
	@Override
	public List<Map> queryAllByParams(Map params) {
		return baseDao.queryAllByParams(params);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.project.dao.common.service.BaseService#queryPageByParams(java.util.
	 * Map)
	 */
	@Override
	public PageInfo<Map> queryPageByParams(Map params) {
		// 分页
		PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()), Integer.parseInt(params.get("limit").toString()), true);
		PageInfo<Map> page = new PageInfo<Map>((List<Map>) baseDao.queryPageByParams(params));

		return page;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.project.dao.common.service.BaseService#deleteById(java.lang.String)
	 */
	@Override
	public int deleteById(String id) {
		return baseDao.deleteById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.project.dao.common.service.BaseService#deleteByEntity(org.project.dao
	 * .common.domain.BaseEntity)
	 */
	@Override
	public int deleteByEntity(T dto) {
		return baseDao.deleteByEntity(dto);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.project.dao.common.service.BaseService#deleteByParams(java.util.Map)
	 */
	@Override
	public int deleteByParams(Map params) {
		return baseDao.deleteByParams(params);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.project.dao.common.service.BaseService#updateByEntity(org.project.dao
	 * .common.domain.BaseEntity)
	 */
	@Override
	public int updateByEntity(T dto) {
		return baseDao.updateByEntity(dto);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.project.dao.common.service.BaseService#updateByParams(java.util.Map)
	 */
	@Override
	public int updateByParams(Map params) {
		return baseDao.updateByParams(params);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.project.dao.common.service.BaseService#countByEntity(org.project.dao.
	 * common.domain.BaseEntity)
	 */
	@Override
	public int countByEntity(T dto) {
		return baseDao.countByEntity(dto);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.project.dao.common.service.BaseService#countByParams(java.util.Map)
	 */
	@Override
	public int countByParams(Map params) {
		return baseDao.countByParams(params);
	}

}
