/*
 * @(#)QuartzTest2.java
 * Author : Zain.Luo
 * Created Date: 2016年11月16日 
 */
package org.project.quartz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;
import static org.quartz.JobBuilder.*;
import static org.quartz.SimpleScheduleBuilder.*;
import static org.quartz.CronScheduleBuilder.*;
import static org.quartz.CalendarIntervalScheduleBuilder.*;
import static org.quartz.TriggerBuilder.*;
import static org.quartz.DateBuilder.*;

/**
 * @title TODO
 * @author Zain.Luo
 * @version 1.0<br>
 * @history<br>
 * 				2016年11月16日 Zain.Luo create file<br>
 *              Id:QuartzTest2.java,v1.0 2016年11月16日 下午6:01:30
 */
public class QuartzTest2 implements Job{

	/**
	 * @Title: setUp
	 * @author: Zain.Luo
	 * @Description: TODO
	 * @throws java.lang.Exception
	 * @return void
	 * @throws @history:
	 *             2016年11月16日 created
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("Test Quartz");
		Scheduler scheduler;
		try {
			scheduler = new StdSchedulerFactory().getDefaultScheduler();
			scheduler.start();
			scheduler.shutdown();
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/* (non-Javadoc)
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("Hello Quartz");
		
	}

}
