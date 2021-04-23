package com.hpi.system.schedule;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduled
{

	@Scheduled(cron = "0/10 * * * * ?")
	public void scheduled(){
		System.out.println("执行了：" + new Date());
	}
	
	@Scheduled(cron = "0/5 * * * * ?")
	public void scheduled1(){
		System.out.println("11111执行了：" + new Date());
	}
}
