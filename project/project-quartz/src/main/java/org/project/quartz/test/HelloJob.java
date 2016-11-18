/*
 * @(#)HelloJob.java
 * Author : Zain.Luo
 * Created Date: 2016年11月18日 
 */
package org.project.quartz.test;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @title TODO
 * @author Zain.Luo
 * @version 1.0<br>
 * @history<br>
 * 				2016年11月18日 Zain.Luo create file<br>
 *              Id:HelloJob.java,v1.0 2016年11月18日 下午2:34:59
 */
public class HelloJob {

	public void run() {
		Logger log = LoggerFactory.getLogger(HelloJob.class);

		log.info("Quartz 调用" + new Date());
	}
}
