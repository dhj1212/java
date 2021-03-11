
package com.cxfwb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for csg_message complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="csg_message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vssid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "csg_message", propOrder = { "vssid", "token", "data" })
public class CsgMessage
{

	protected String vssid;
	protected String token;
	protected String data;

	/**
	 * Gets the value of the vssid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVssid()
	{
		return vssid;
	}

	/**
	 * Sets the value of the vssid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVssid(String value)
	{
		this.vssid = value;
	}

	/**
	 * Gets the value of the token property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getToken()
	{
		return token;
	}

	/**
	 * Sets the value of the token property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setToken(String value)
	{
		this.token = value;
	}

	/**
	 * Gets the value of the data property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getData()
	{
		return data;
	}

	/**
	 * Sets the value of the data property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setData(String value)
	{
		this.data = value;
	}

}
