/*
 * @(#)DemoTest.java
 * Author : Zain.Luo
 * Created Date: 2016年11月18日 
 */
package org.project.quartz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title TODO 
 * @author Zain.Luo
 * @version 1.0<br>
 * @history<br>
 * 2016年11月18日 Zain.Luo create file<br>
 * Id:DemoTest.java,v1.0 2016年11月18日 下午3:37:55
 */
public class DemoTest {

	/** 
	* @Title: setUp 
	* @author: Zain.Luo
	* @Description: TODO
	* @throws java.lang.Exception    
	* @return void    
	* @throws 
	* @history: 2016年11月18日 created
	*/
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("Begin");
		ApplicationContext context = new ClassPathXmlApplicationContext("biz-quartz.xml");
		System.out.println("end");
	}

}
