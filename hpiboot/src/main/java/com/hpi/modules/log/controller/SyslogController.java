package com.hpi.modules.log.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hpi.modules.log.entity.Syslog;
import com.hpi.modules.log.mapper.SyslogMapper;
import com.hpi.modules.log.service.SyslogService;
import com.hpi.vo.api.Result;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

/**
 * <p>
 * 日志表 前端控制器
 * </p>
 *
 * @author dhj
 * @since 2020-09-30
 */
@Slf4j
@Controller
@RequestMapping("/log/syslog")
public class SyslogController {
	//@Autowired
	//private SyslogMapper syslogMapper;
	//http://localhost:8088/log/syslog/show1?id=2
	@Autowired
	private SyslogService syslogService;
	@RequestMapping("/show1")
    public String findLog(Model model,String id) {
		System.out.println("id===="+id);
		Syslog log=this.syslogService.findLogById(id);
		if(log!=null){
			System.out.println("Content==="+log.getContent());
		}
		model.addAttribute("log", log);
		return "/log/log";
	}
	
	@RequestMapping("/findLogQuery")
    public String findLogQuery(Model model,String content) {
		IPage<Syslog> page = new Page<Syslog>();
		
        page.setCurrent(1);
        page.setSize(5);
        content="123";
        page=this.syslogService.findLogQuery(page,content);
		if(page!=null){
			System.out.println("page===="+page.getPages());
			List<Syslog> list=page.getRecords();
			for (Syslog log : list){
				System.out.println("id="+log.getLogid()+";Content="+log.getContent());
			}
		}
		Syslog log = new Syslog();
		log.setContent("retryrt");
		log.setLogdate(com.hpi.util.DateUtils.getDate());
		syslogService.addLog(log);
		model.addAttribute("page", page);
		return "/log/log1";
	}
	/**
	 * 
	 * @方法说明: TODO
	 * @参数： @param log
	 * @参数： @return   
	 * @返回值： Result<Syslog>  
	 * @异常：
	 * @作者： duhj
	 * @创建日期 2020年9月28日
	 *
	 * 历史记录
	 * 1、修改日期：
	 *    修改人：
	 *    修改内容：
	 */
	@RequestMapping(value = "/addlog", method = RequestMethod.POST)
	@ResponseBody
	public Result<Syslog> addLog(Syslog log) {
		Result<Syslog> result = new Result<Syslog>();
		
		try {
			//log.setContent("retryrt");
			log.setLogdate(com.hpi.util.DateUtils.getDate());
			syslogService.addLog(log);
			result.success("添加成功！");
		} catch (Exception e) {
			//log.error(e.getMessage(), e);
			result.error500("操作失败");
		}
		return result;
	}
}
