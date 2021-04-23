package com.hpi.modules.cas.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.jasig.cas.client.authentication.AttributePrincipal;
import org.jasig.cas.client.util.AbstractCasFilter;
import org.jasig.cas.client.validation.Assertion;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cas")
public class Cascontroller
{
	@Value(value = "${cas.server-url-prefix}")
    private String serverUrlPrefix = "";

    @Value(value = "${cas.client-host-url}")
    private String clientHostUrl = "";
    
	@RequestMapping("/index")
	@ResponseBody
	public String index(HttpServletRequest request){
		String name = request.getRemoteUser();
		System.out.println("name===="+name);
		//return "cas client success";
		Assertion assertion = (Assertion) request.getSession().getAttribute(AbstractCasFilter.CONST_CAS_ASSERTION);
        String loginName = null;
        if (assertion != null) {
            AttributePrincipal principal = assertion.getPrincipal();
            loginName = principal.getName();
            System.out.println("访问者:" + loginName);
        }
        return "访问者:" + loginName;
	}
	
	/**
	 * 
	 * @方法说明: 注销
	 * @参数： @param session
	 * @参数： @return   
	 * @返回值： String  
	 * @异常：
	 * @作者： duhj
	 * @创建日期 2021年4月20日
	 *
	 * 历史记录
	 * 1、修改日期：
	 *    修改人：
	 *    修改内容：
	 */
	@RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:" + serverUrlPrefix + "/logout?service=" + clientHostUrl + "/sso-client/user";
    }


}
