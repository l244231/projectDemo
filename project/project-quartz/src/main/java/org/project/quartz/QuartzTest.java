/*
 * @(#)QuartzTest.java
 * Author : Zain.Luo
 * Created Date: 2016年11月16日 
 */
package org.project.quartz;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @title quartz测试类
 * @author Zain.Luo
 * @version 1.0<br>
 * @history<br>
 * 				2016年11月16日 Zain.Luo create file<br>
 *              Id:QuartzTest.java,v1.0 2016年11月16日 下午5:40:01
 */
public class QuartzTest {
	public static void main(String[] args) {
		try {
			Scheduler scheduler = new StdSchedulerFactory().getDefaultScheduler();

			scheduler.start();
			scheduler.shutdown();
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
