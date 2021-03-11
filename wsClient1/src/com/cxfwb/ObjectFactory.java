
package com.cxfwb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface
 * generated in the com.cxfwb package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation
 * for XML content. The Java representation of XML content can consist of schema derived interfaces
 * and classes representing the binding of schema type definitions, element declarations and model
 * groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory
{

	private final static QName _CsgMessageResponse_QNAME = new QName("http://cxfWB.com/",
			"csg_messageResponse");
	private final static QName _CsgMessage_QNAME = new QName("http://cxfWB.com/", "csg_message");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes
	 * for package: com.cxfwb
	 * 
	 */
	public ObjectFactory()
	{
	}

	/**
	 * Create an instance of {@link CsgMessage }
	 * 
	 */
	public CsgMessage createCsgMessage()
	{
		return new CsgMessage();
	}

	/**
	 * Create an instance of {@link CsgMessageResponse }
	 * 
	 */
	public CsgMessageResponse createCsgMessageResponse()
	{
		return new CsgMessageResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CsgMessageResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://cxfWB.com/", name = "csg_messageResponse")
	public JAXBElement<CsgMessageResponse> createCsgMessageResponse(CsgMessageResponse value)
	{
		return new JAXBElement<CsgMessageResponse>(_CsgMessageResponse_QNAME,
				CsgMessageResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CsgMessage }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://cxfWB.com/", name = "csg_message")
	public JAXBElement<CsgMessage> createCsgMessage(CsgMessage value)
	{
		return new JAXBElement<CsgMessage>(_CsgMessage_QNAME, CsgMessage.class, null, value);
	}

}
