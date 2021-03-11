package com.cxfwb;

import java.net.MalformedURLException;
import java.net.URL;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


//@javax.jws.WebService(endpointInterface = "com.cxfwb.IcxfWB", targetNamespace = "http://cxfWB.com/", serviceName = "IcxfWBImplService", portName = "IcxfWBImplPort")
@WebServiceClient(name = "IcxfWBImplService", targetNamespace = "http://cxfWB.com/", wsdlLocation = "http://127.0.0.1:8080/CxfWebvervice/csg_message?wsdl")
public class IcxfWBImplPortImpl extends Service
{

	
	private final static URL SERVICESERVICE_WSDL_LOCATION;
	private final static WebServiceException SERVICESERVICE_EXCEPTION;
	//private final static QName SERVICESERVICE_QNAME = new QName("http://service.com/", "ServiceService");
	private final static QName SERVICESERVICE_QNAME = new QName("http://cxfWB.com/", "IcxfWBImplService");

	static {
	    URL url = null;
	    WebServiceException e = null;
	    try {
	        //url = new URL("http://192.168.1.94:13201/vss/2.0/workflow/CSGServiceServiceSync?wsdl");
	        url = new URL("http://127.0.0.1:8080/CxfWebvervice/csg_message?wsdl");
	    } catch (MalformedURLException ex) {
	        e = new WebServiceException(ex);
	    }
	    SERVICESERVICE_WSDL_LOCATION = url;
	    SERVICESERVICE_EXCEPTION = e;
	}
		
		
		public IcxfWBImplPortImpl() {
	        super(__getWsdlLocation(), SERVICESERVICE_QNAME);
	    }

	    public IcxfWBImplPortImpl(WebServiceFeature... features) {
	        super(__getWsdlLocation(), SERVICESERVICE_QNAME, features);
	    }

	    public IcxfWBImplPortImpl(URL wsdlLocation) {
	        super(wsdlLocation, SERVICESERVICE_QNAME);
	    }

	    public IcxfWBImplPortImpl(URL wsdlLocation, WebServiceFeature... features) {
	        super(wsdlLocation, SERVICESERVICE_QNAME, features);
	    }

	    public IcxfWBImplPortImpl(URL wsdlLocation, QName serviceName) {
	        super(wsdlLocation, serviceName);
	    }

	    public IcxfWBImplPortImpl(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
	        super(wsdlLocation, serviceName, features);
	    }

	    /**
	     * 
	     * @return
	     *     returns ServiceDelegate
	     */
	    @WebEndpoint(name = "IcxfWBImplPort")
	    public IcxfWB getServicePort() {
	       // return super.getPort(new QName("http://service.com/", "ServicePort"), ServiceDelegate.class);
	        return super.getPort(new QName("http://cxfWB.com/", "IcxfWBImplPort"), IcxfWB.class);
	    }

	    /**
	     * 
	     * @param features
	     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
	     * @return
	     *     returns ServiceDelegate
	     */
	    @WebEndpoint(name = "IcxfWBImplPort")
	    public IcxfWB getServicePort(WebServiceFeature... features) {
	        //return super.getPort(new QName("http://service.com/", "ServicePort"), ServiceDelegate.class, features);
	        return super.getPort(new QName("http://cxfWB.com/", "IcxfWBImplPort"), IcxfWB.class, features);
	    }

	    private static URL __getWsdlLocation() {
	        if (SERVICESERVICE_EXCEPTION!= null) {
	            throw SERVICESERVICE_EXCEPTION;
	        }
	        return SERVICESERVICE_WSDL_LOCATION;
	    }
	/*public String csgMessage(@WebParam(name = "vssid") String vssid,
			@WebParam(name = "token") String token, @WebParam(name = "data") String data)
	{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}*/

}