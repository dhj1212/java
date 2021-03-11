package com.hpi.util;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class MD5Utils
{
	 public static final String SALT = "hpi";
	 public static final int ITERATIONS = 10; 
	 private static final String ALGORITH_NAME = "md5";
	 /**
	  * 
	  * @方法说明: TODO
	  * @参数： @param source
	  * @参数： @return   
	  * @返回值： String  
	  * @异常：
	  * @作者： duhj
	  * @创建日期 2020年6月18日
	  *
	  * 历史记录
	  * 1、修改日期：
	  *    修改人：
	  *    修改内容：
	  */
	 public static String encrype(String source){
        return  new SimpleHash(ALGORITH_NAME,source,ByteSource.Util.bytes(SALT),ITERATIONS).toHex();
     }
	 /**
	  * 
	  * @方法说明: TODO
	  * @参数： @param source
	  * @参数： @param salt
	  * @参数： @return   
	  * @返回值： String  
	  * @异常：
	  * @作者： duhj
	  * @创建日期 2020年6月18日
	  *
	  * 历史记录
	  * 1、修改日期：
	  *    修改人：
	  *    修改内容：
	  */
	 public static String encrype(String source,String salt){
        return  new SimpleHash(ALGORITH_NAME,source,ByteSource.Util.bytes(salt),ITERATIONS).toHex();
       // ab47e02e96038654c8b03b904c1673c0
     }
	 
	 public static String encrypename(String username, String source) {
		 return  new SimpleHash(ALGORITH_NAME, source, ByteSource.Util.bytes(username + SALT),
	       ITERATIONS).toHex();
	 }
	 
	 public static void main(String[] args) {

        System.out.println(encrype("123"));

    }
}
