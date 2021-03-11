package com.hpi.util;


import org.springframework.context.ApplicationContext;

/**
 * 
 * <pre>
 * @业务名:
 * @功能说明: 系统调用各业务接口的类 外部使用
 * @编写日期:	2020年6月13日
 * @作者:	duhj
 * 
 * 历史记录
 * 1、修改日期：
 *    修改人：
 *    修改内容：
 * </pre>
 */
public final class ServiceLocator
{
    private static ServiceLocator instance;
    private ApplicationContext context = null;

    public static ServiceLocator getInstance()
    {
        if(instance!=null) return instance;
        else return instance = new ServiceLocator();
    }
    @SuppressWarnings("unused")
	private ApplicationContext getContext()
    {
        return context;
    }
    public void setContext(ApplicationContext context)
    {
        this.context = context;
    }
    @SuppressWarnings("unused")
	private Object getService(String service)
    {
        return context.getBean(service);
    }
       

   /* public UserManagerService getUserManagerService()
    {
        return (UserManagerService)this.getService("userManagerService");
    } 
    
    public WorkFlowService getWorkFlowService()
    {
        return (WorkFlowService)this.getService("workFlowService");
    }  
    
    public WeiXinManagerService getWeiXinManagerService()
    {
        return (WeiXinManagerService)this.getService("weiXinManagerService");
    }  */
}
