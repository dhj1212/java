package com.hpi.exception;

/**
 * 
 * <pre>
 * @业务名:
 * @功能说明: 统一异常处理
 * @编写日期:	2020年7月24日
 * @作者:	duhj
 * 
 * 历史记录
 * 1、修改日期：
 *    修改人：
 *    修改内容：
 * </pre>
 */
public class AppException extends RuntimeException
{

	private static final long serialVersionUID = -1;
	
	public AppException(String message){
		super(message);
	}
	
	public AppException(Throwable cause)
	{
		super(cause);
	}
	
	public AppException(String message,Throwable cause)
	{
		super(message,cause);
	}

}
