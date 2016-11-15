/*
 * @(#)TestController.java
 * Author : Zain.Luo
 * Created Date: 2016年11月2日 
 */
package com.project.web.controller.test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.core.constant.FileConstant;
import org.project.dao.domain.SysUserDTO;
import org.project.dao.service.sys.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * @title 测试类
 * @author Zain.Luo
 * @version 1.0<br>
 * @history<br>
 * 				2016年11月2日 Zain.Luo create file<br>
 *              Id:TestController.java,v1.0 2016年11月2日 下午4:33:17
 */
@Controller
public class TestController {

	@Autowired
	private SysUserService service;

	@RequestMapping("test")
	public String testController(HttpServletRequest request, HttpServletResponse resopnse) {
		System.out.println("Hello World");
		List<SysUserDTO> list = service.querySysUser();
		System.out.println(list.get(0).getId());
		return "index";
	}

	/**
	 * @Title: uploadFile
	 * @author: Zain.Luo
	 * @Description: 文件上传
	 * @param request
	 * @param resopnse
	 * @return
	 * @return String
	 * @throws @history:
	 *             2016年11月4日 created
	 */
	@RequestMapping("testUpload")
	public void uploadFile(HttpServletRequest request, HttpServletResponse resopnse) {

		/* 判断是否指定存放路径，没有指定将存放在临时目录中 */
		String filePath = request.getParameter("filePath");
		if (filePath != null && !filePath.equals("")) {
			filePath = FileConstant.FILE_DEFAULT_SAVE_PATH + filePath;
		} else {
			filePath = FileConstant.FILE_TMP_SAVE_PATH;
		}

		/* 多文件上传处理逻辑 */
		try {
			// 创建一个通用的多部分解析器
			CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
					request.getSession().getServletContext());
			// 判断 request 是否有文件上传,即多部分请求
			if (multipartResolver.isMultipart(request)) {
				// 转换成多部分request
				MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
				// 取得request中的所有文件名
				Iterator<String> iter = multiRequest.getFileNames();

				while (iter.hasNext()) {
					// 取得上传文件
					MultipartFile file = multiRequest.getFile(iter.next());
					if (file != null) {
						// 取得当前上传文件的文件名称
						String myFileName = file.getOriginalFilename();
						// 如果名称不为“”,说明该文件存在，否则说明该文件不存在
						if (myFileName.trim() != "") {
							// 重命名上传后的文件名
							String fileName = "demoUpload" + file.getOriginalFilename();
							// 定义上传路径
							String path = filePath + fileName;
							File localFile = new File(path);

							file.transferTo(localFile);

						}
					}
				}

			}
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
