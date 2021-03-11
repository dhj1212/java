package com.cxfwb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import net.sf.json.JSONObject;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class ConvertBASE64 {
	/**
	 * ���ļ�ת��base64 �ַ�
	 * 
	 * @param path
	 *            �ļ�·��
	 * @return *
	 * @throws Exception
	 */

	public static String encodeBase64File(String path) throws Exception {
		File file = new File(path);
		FileInputStream inputFile = new FileInputStream(file);
		byte[] buffer = new byte[(int) file.length()];
		inputFile.read(buffer);
		inputFile.close();
		return new BASE64Encoder().encode(buffer);

	}

	/**
	 * ��base64�ַ���뱣���ļ�
	 * 
	 * @param base64Code
	 * @param targetPath
	 * @throws Exception
	 */

	public static void decoderBase64File(String base64Code, String targetPath)
			throws Exception {
		byte[] buffer = new BASE64Decoder().decodeBuffer(base64Code);
		FileOutputStream out = new FileOutputStream(targetPath);
		out.write(buffer);
		out.close();

	}

	/**
	 * ��base64�ַ���ı��ļ�
	 * 
	 * @param base64Code
	 * @param targetPath
	 * @throws Exception
	 */

	public static void toFile(String base64Code, String targetPath)
			throws Exception {

		byte[] buffer = base64Code.getBytes();
		FileOutputStream out = new FileOutputStream(targetPath);
		out.write(buffer);
		out.close();
	}
	
	
	public static String toJson(Object obj){
		JSONObject ja=JSONObject.fromObject(obj);
		return ja.toString();
	}
	public static Object toObject(String JSONString,Class cls){
		return JSONObject.toBean(JSONObject.fromObject(JSONString), cls);
	}
	
	public static void writeByteArrayToFile(File srcFile,byte[] data) throws IOException
	{
		FileUtils.writeByteArrayToFile(srcFile, data);
	}
	public static byte[] readFileToByteArray(File srcFile) throws IOException
	{
		return FileUtils.readFileToByteArray(srcFile);
	}
	
	public static String encode(String string)
	{
		return new String(Base64.encodeBase64(string.getBytes()));
		
	}

	public static void main(String[] args) {
		try {
			String a = "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";
			// String base64Code = encodeBase64File("D:/0101-2011-qqqq.tif");
			// System.out.println(base64Code);
			decoderBase64File(a, "D:/2.jpg");
			// toFile(base64Code, "D:\\three.txt");
		}
		catch (Exception e) {
			e.printStackTrace();

		}

	}

}
