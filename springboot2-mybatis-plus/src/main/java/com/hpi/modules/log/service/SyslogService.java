package com.hpi.modules.log.service;

import com.hpi.modules.log.entity.Syslog;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 日志表 服务类
 * </p>
 *
 * @author dhj
 * @since 2020-09-30
 */
public interface SyslogService extends IService<Syslog> {
	/**
	 * 
	 * @方法说明: TODO
	 * @参数： @param id
	 * @参数： @return   
	 * @返回值： Syslog  
	 * @异常：
	 * @作者： duhj
	 * @创建日期 2020年9月28日
	 *
	 * 历史记录
	 * 1、修改日期：
	 *    修改人：
	 *    修改内容：
	 */
	Syslog findLogById(String id);
	
	/**
	 * 
	 * @方法说明: 分页查询
	 * @参数： @param page 分页参数
	 * @参数： @param content
	 * @参数： @return   
	 * @返回值： IPage<Syslog>  
	 * @异常：
	 * @作者： duhj
	 * @创建日期 2020年9月28日
	 *
	 * 历史记录
	 * 1、修改日期：
	 *    修改人：
	 *    修改内容：
	 */
	IPage<Syslog> findLogQuery(IPage<Syslog> page, String content);
	
	/**
	 * 
	 * @方法说明: TODO
	 * @参数： @param log   
	 * @返回值： void  
	 * @异常：
	 * @作者： duhj
	 * @创建日期 2020年9月28日
	 *
	 * 历史记录
	 * 1、修改日期：
	 *    修改人：
	 *    修改内容：
	 */
	void addLog(Syslog log);
}
