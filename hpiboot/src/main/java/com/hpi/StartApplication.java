package com.hpi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import net.unicon.cas.client.configuration.EnableCasClient;

/**
 * 
 * <pre>
 * @业务名:
 * @功能说明: 
 * @编写日期:	2019-7-9
 * @作者:	duhj
 * 
 * 历史记录
 * 1、修改日期：
 *    修改人：
 *    修改内容：
 * </pre>
 */
//@SpringBootApplication(scanBasePackages = {"com.hpi.controller","com.hpi.service","com.hpi.dao"})
//@ComponentScan("com.hpi")//包名：扫描这个包下面的加了@Controller注解的类及其子包的加了@Controller注解的类，或者加了Service注解等其他组件注解的类  
//@EnableJpaRepositories("com.hpi.dao") // JPA扫描该包路径下的Repositories  
//@EntityScan("com.hpi.domain") // 扫描实体类  

//@ServletComponentScan//这行是为了避免扫描不到Druid的Servlet
//@EnableJpaRepositories("com.hpi.dao") // JPA扫描该包路径下的Repositories  
//@EntityScan("com.hpi.entity") // 扫描实体类
@EnableCasClient // 启用cas 客户端
@EnableTransactionManagement // 启注解事务管理   
@ServletComponentScan(basePackages = "com.hpi.system.filters")
@SpringBootApplication(
        exclude = {
                org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
                org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
        }
)///activiti剔除 SecurityAutoConfiguration
//@SpringBootApplication
@ComponentScan(basePackages
        = {
        "com.hpi.modules",
        "com.hpi.system"
})
//@EnableScheduling //Scheduled定时任务开启
public class StartApplication extends SpringBootServletInitializer
{

	/**
	 * @方法说明: TODO
	 * @参数： @param args   
	 * @返回值： void
	 * @异常：
	 * @作者： duhj
	 * @创建日期 2019-6-17
	 *
	 * 历史记录
	 * 1、修改日期：
	 *    修改人：
	 *    修改内容：
	 */
	public static void main(String[] args)
	{
	//	System.setProperty("spring.devtools.restart.enabled", "false");//完全关闭重启支持
		SpringApplication.run(StartApplication.class, args);
	}
	
	// 打war包上线需要的操作 
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(StartApplication.class);
    }
    
   /* @Bean
    public OpenEntityManagerInViewFilter openEntityManagerInViewFilter() {
         return new OpenEntityManagerInViewFilter();
    }*/

    /**
    @Bean("duridDatasource")
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource druidDataSource() {
    	return new DruidDataSource();
    }
	**/


    
    //在 HibernateDaoImp 增加
	//private SessionFactory sessionFactory;
	 //放开以下任意一个
	 
	/**@Bean
    public SessionFactory sessionFactory(@Qualifier("entityManagerFactory") EntityManagerFactory emf){
        return emf.unwrap(SessionFactory.class);
    }*/
    
   //         或者
   /** @SuppressWarnings("deprecation")
	@Bean
    public HibernateJpaSessionFactoryBean sessionFactory() {
        return new HibernateJpaSessionFactoryBean();
    }
    
  
	@Bean
    public HibernateJpaSessionFactoryBean sessionFactory() {
        return new HibernateJpaSessionFactoryBean();
    }
	
	@Bean
    public HibernateJpaSessionFactoryBean sessionFactory() {
        return new HibernateJpaSessionFactoryBean();
    }
    */
	
}
