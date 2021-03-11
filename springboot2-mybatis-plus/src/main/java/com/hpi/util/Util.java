package com.hpi.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.corba.se.impl.io.TypeMismatchException;


public class Util
{
	private static Util instance;
	protected final Logger log = LoggerFactory.getLogger(Util.class);
	
	public static Util getInstance() {
		if (instance != null)
			return instance;
		else
			return instance = new Util();
	}
	
	/**
	 * 
	 * @方法说明: 判断字符串是否为空
	 * @参数： @param str
	 * @参数： @return   
	 * @返回值： boolean  
	 * @异常：
	 * @作者： duhj
	 * @创建日期 2017-11-8
	 *
	 * 历史记录
	 * 1、修改日期：
	 *    修改人：
	 *    修改内容：
	 */
	public boolean isEmpty(String  str)
	{
		if (str!=null && str.trim().length()>0 && !str.equals("null")){
			return false;
		}else{
			return true;
		}
	}
	
	/**
	 * 
	 * @方法说明: 判断是否不为空
	 * @参数： @param str
	 * @参数： @return   
	 * @返回值： boolean  
	 * @异常：
	 * @作者： duhj
	 * @创建日期 2017-11-8
	 *
	 * 历史记录
	 * 1、修改日期：
	 *    修改人：
	 *    修改内容：
	 */
	public boolean isNotEmpty(String  str)
	{
		if (str!=null && str.trim().length()>0 && !str.equals("null")){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 
	 * @方法说明: 把字符型日期转换成Date
	 * @参数： @param source
	 * @参数： @return   
	 * @返回值： Date  
	 * @异常：
	 * @作者： duhj
	 * @创建日期 2020年6月20日
	 *
	 * 历史记录
	 * 1、修改日期：
	 *    修改人：
	 *    修改内容：
	 */
	public Date convertDate(String source) {
	        SimpleDateFormat sdf = getSimpleDateFormat(source);
	        try {
	            Date date = sdf.parse(source);
	            return date;
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }

	    private SimpleDateFormat getSimpleDateFormat(String source) {
	        SimpleDateFormat sdf = new SimpleDateFormat();
	        if (Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", source)) { // yyyy-MM-dd
	            sdf = new SimpleDateFormat("yyyy-MM-dd");
	        } else if (Pattern.matches("^\\d{4}-\\d{2}-\\d{2} \\d{2}-\\d{2}-\\d{2}$", source)) { // yyyy-MM-dd HH-mm-ss
	            sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	        } else if (Pattern.matches("^\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}$", source)) { // yyyy-MM-dd HH:mm:ss
	            sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        } else if (Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$", source)) { // yyyy/MM/dd
	            sdf = new SimpleDateFormat("yyyy/MM/dd");
	        } else if (Pattern.matches("^\\d{4}/\\d{2}/\\d{2} \\d{2}/\\d{2}/\\d{2}$", source)) { // yyyy/MM/dd HH/mm/ss
	            sdf = new SimpleDateFormat("yyyy/MM/dd HH/mm/ss");
	        }  else if (Pattern.matches("^\\d{4}\\d{2}\\d{2}$", source)) { // yyyyMMdd
	            sdf = new SimpleDateFormat("yyyyMMdd");
	        }  else if (Pattern.matches("^\\d{4}\\d{2}\\d{2} \\d{2}\\d{2}\\d{2}$", source)) { // yyyyMMdd HHmmss
	            sdf = new SimpleDateFormat("yyyyMMdd HHmmss");
	        } else if (Pattern.matches("^\\d{4}\\.\\d{2}\\.\\d{2}$", source)) { // yyyy.MM.dd
	            sdf = new SimpleDateFormat("yyyy.MM.dd");
	        }  else if (Pattern.matches("^\\d{4}\\.\\d{2}\\.\\d{2} \\d{2}\\.\\d{2}\\.\\d{2}$", source)) { // yyyy.MM.dd HH.mm.ss
	            sdf = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss");
	        }else{
	            System.out.println("TypeMismatchException");
	            throw new TypeMismatchException();
	        }
	        return sdf;
	    }
	
}
