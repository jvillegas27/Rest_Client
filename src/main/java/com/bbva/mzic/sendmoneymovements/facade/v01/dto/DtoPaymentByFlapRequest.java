
package com.bbva.mzic.sendmoneymovements.facade.v01.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DtoPaymentByFlapRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DtoPaymentByFlapRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="movementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movementReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originTelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationTelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusMovement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{urn:com:bbva:mzic:sendmoneymovements:facade:v01:dto}DtoMoney" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DtoPaymentByFlapRequest", propOrder = {
    "movementId",
    "movementReferenceNumber",
    "originTelephoneNumber",
    "destinationTelephoneNumber",
    "message",
    "accountNumber",
    "statusMovement",
    "amount"
})
public class DtoPaymentByFlapRequest {

    protected String movementId;
    protected String movementReferenceNumber;
    protected String originTelephoneNumber;
    protected String destinationTelephoneNumber;
    protected String message;
    protected String accountNumber;
    protected String statusMovement;
    protected DtoMoney amount;

    /**
     * Gets the value of the movementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementId() {
        return movementId;
    }

    /**
     * Sets the value of the movementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementId(String value) {
        this.movementId = value;
    }

    /**
     * Gets the value of the movementReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementReferenceNumber() {
        return movementReferenceNumber;
    }

    /**
     * Sets the value of the movementReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementReferenceNumber(String value) {
        this.movementReferenceNumber = value;
    }

    /**
     * Gets the value of the originTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginTelephoneNumber() {
        return originTelephoneNumber;
    }

    /**
     * Sets the value of the originTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginTelephoneNumber(String value) {
        this.originTelephoneNumber = value;
    }

    /**
     * Gets the value of the destinationTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationTelephoneNumber() {
        return destinationTelephoneNumber;
    }

    /**
     * Sets the value of the destinationTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationTelephoneNumber(String value) {
        this.destinationTelephoneNumber = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the statusMovement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusMovement() {
        return statusMovement;
    }

    /**
     * Sets the value of the statusMovement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMovement(String value) {
        this.statusMovement = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link DtoMoney }
     *     
     */
    public DtoMoney getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DtoMoney }
     *     
     */
    public void setAmount(DtoMoney value) {
        this.amount = value;
    }

}
