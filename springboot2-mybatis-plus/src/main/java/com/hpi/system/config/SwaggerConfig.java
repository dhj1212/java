package com.hpi.system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * <pre>
 * @业务名:
 * @功能说明: 
 * @编写日期:	2020年6月19日
 * @作者:	duhj
 * 
 * 历史记录
 * 1、修改日期：
 *    修改人：
 *    修改内容：http://localhost:8081/swagger-ui.html
 * </pre>
 */
@Configuration//用@Configuration注解该类，等价于XML中配置beans；用@Bean标注方法等价于XML中配置bean
@EnableSwagger2//开启Swagger2
//@Profile({"dev", "test"})// 设置 dev test 环境开启 prod 环境就关闭了
@EnableWebMvc
public class SwaggerConfig extends WebMvcConfigurationSupport
{
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.hpi.controller"))
				.paths(PathSelectors.any())
				.build();
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("springboot利用swagger构建api文档")
				.description("API 描述")
				 //创建人
				.contact(new Contact("dhjToBigData", "http://www.dhj1212.com", "376196834@qq.com"))
				.termsOfServiceUrl("http://blog.csdn.net/saytime")
				.version("1.0")
				.build();
	}
	
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry)
	{
		 // 解决静态资源无法访问
       // registry.addResourceHandler("/**")
       //         .addResourceLocations("classpath:/static/");
        // 解决swagger无法访问
        //registry.addResourceHandler("/swagger-ui.html")
        //        .addResourceLocations("classpath:/META-INF/resources/");
        // 解决swagger的js文件无法访问
       // registry.addResourceHandler("/webjars/**")
       //         .addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
}
