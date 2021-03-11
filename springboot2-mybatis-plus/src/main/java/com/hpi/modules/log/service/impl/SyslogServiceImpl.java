package com.hpi.modules.log.service.impl;

import com.hpi.modules.log.entity.Syslog;
import com.hpi.modules.log.mapper.SyslogMapper;
import com.hpi.modules.log.service.SyslogService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 日志表 服务实现类
 * </p>
 *
 * @author dhj
 * @since 2020-09-30
 */
@Service
public class SyslogServiceImpl extends ServiceImpl<SyslogMapper, Syslog> implements SyslogService {
	
	@Autowired
	private SyslogMapper syslogMapper;
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
	public Syslog findLogById(String id) {
		return syslogMapper.selectById(id);
	}
	
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
	public IPage<Syslog> findLogQuery(IPage<Syslog> page, String content) {
        return this.syslogMapper.findLogQuery(page,content);
    }
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
	@Transactional
	public void addLog(Syslog log) {
		syslogMapper.insert(log);
    }
}
