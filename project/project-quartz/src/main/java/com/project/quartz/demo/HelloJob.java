/*
 * @(#)HelloJob.java
 * Author : Zain.Luo
 * Created Date: 2016年11月18日 
 */
package com.project.quartz.demo;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @title TODO
 * @author Zain.Luo
 * @version 1.0<br>
 * @history<br>
 * 				2016年11月18日 Zain.Luo create file<br>
 *              Id:HelloJob.java,v1.0 2016年11月18日 下午2:34:59
 */
public class HelloJob implements Job{

	public void work() {
		System.out.println("Quartz 调用" + new Date());
		System.out.println("Quartz 调用" + new Date());
		System.out.println("Quartz 调用" + new Date());
	}

	/* (non-Javadoc)
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext paramJobExecutionContext) throws JobExecutionException {
		work();
	}

	 
}
