package com.hpi.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hpi.StartApplication;

/**
 * SpringBoot测试类
 *@RunWith:启动器 
 *SpringJUnit4ClassRunner.class：让junit与spring环境进行整合
 *
 *@SpringBootTest(classes={StartApplication.class}) 1,当前类为springBoot的测试类
 *@SpringBootTest(classes={StartApplication.class}) 2,加载SpringBoot启动类。启动springBoot
 *
 *junit与spring整合 @Contextconfiguartion("classpath:applicationContext.xml")
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes={StartApplication.class})
public class UserServiceTest
{
	//@Autowired 
	//UserService userService;
	
	@Test
	public void testAddUser(){
		
		/*try {
			TDept dept = new TDept();
			dept.setDeptname("运行部");;
			dept.setSeq(Long.valueOf(1));
			dept.setPdeptid("-1");
			dept.setLead("lead");
			dept.setIsgdj("0");
			dept.setDepttype("3");
			this.userService.addDept(dept);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}*/
	}
}
