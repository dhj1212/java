package com.hpi.modules.log.mapper;

import com.hpi.modules.log.entity.Syslog;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 日志表 Mapper 接口
 * </p>
 *
 * @author dhj
 * @since 2020-09-30
 */
public interface SyslogMapper extends BaseMapper<Syslog> {
	/**
	 * 
	 * @方法说明: TODO
	 * @参数： @param page
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
	IPage<Syslog> findLogQuery(IPage<Syslog> page, @Param("content") String content);
}
