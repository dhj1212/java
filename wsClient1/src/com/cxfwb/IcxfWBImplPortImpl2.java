package com.cxfwb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import javax.jws.WebParam;

@javax.jws.WebService(endpointInterface = "com.cxfwb.IcxfWB", targetNamespace = "http://cxfWB.com/", serviceName = "IcxfWBImplService", portName = "IcxfWBImplPort")

public class IcxfWBImplPortImpl2
{

	public String csgMessage(@WebParam(name = "vssid") String vssid,
			@WebParam(name = "token") String token, @WebParam(name = "data") String data)
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

}