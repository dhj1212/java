package com.hpi.system.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
//import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;

@Configuration
@MapperScan(value={"com.hpi.modules.**.mapper*"})
public class MybatisPlusConfig
{
	  /**
     * mybatis-plus SQL执行效率插件【生产环境可以关闭】
     */
   /* @Bean
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }*/
	
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
    	 /*PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
         // 设置方言
         paginationInterceptor.setDialectType("mysql");
         return paginationInterceptor;*/
    	return new PaginationInterceptor().setLimit(-1);//设置sql的limit为无限制，默认是500
        //return new PaginationInterceptor();
    }


}
