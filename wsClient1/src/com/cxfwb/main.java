package com.cxfwb;



public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//传输两个文件 file1,file2,可自定义传输格式。
		//eipuser
		String file1 = "";
		String file2 = "";
		try {
			file1 = ConvertBASE64.encodeBase64File("c://ku.sql");
		}
		catch (Exception fe) {
			
		}
		file2 = file1;
	
		String files = "&lt;GFILE1&gt;" + file1 + "&lt;/GFILE1&gt;&lt;GFILE2&gt;" + file2
				+ "&lt;/GFILE2&gt;";
		String data = "&lt;ROOT&gt;&lt;DATA&gt;test&lt;/DATA&gt;" + files + "&lt;/ROOT&gt;";
		
		//ServiceService c = new ServiceService();
		//ServiceDelegate client = c.getServicePort();
		IcxfWBImplPortImpl c =new IcxfWBImplPortImpl();
		IcxfWB client = c.getServicePort();
		String response = client.csgMessage("1",data,
				"BC8F158F90C5F4049836E818DE824ED5");
		System.out.println("Response: " + response);

	}

}
