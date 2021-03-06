
package com.bbva.mzic.sendmoneymovements.facade.v01.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bbva.mzic.sendmoneymovements.facade.v01.dto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PaymentByFlapRequest_QNAME = new QName("urn:com:bbva:mzic:sendmoneymovements:facade:v01:dto", "PaymentByFlapRequest");
    private final static QName _Money_QNAME = new QName("urn:com:bbva:mzic:sendmoneymovements:facade:v01:dto", "Money");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bbva.mzic.sendmoneymovements.facade.v01.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DtoPaymentByFlapRequest }
     * 
     */
    public DtoPaymentByFlapRequest createDtoPaymentByFlapRequest() {
        return new DtoPaymentByFlapRequest();
    }

    /**
     * Create an instance of {@link DtoMoney }
     * 
     */
    public DtoMoney createDtoMoney() {
        return new DtoMoney();
    }

    /**
     * Create an instance of {@link DtoPaymentByFlapResponse }
     * 
     */
    public DtoPaymentByFlapResponse createDtoPaymentByFlapResponse() {
        return new DtoPaymentByFlapResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPaymentByFlapRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:mzic:sendmoneymovements:facade:v01:dto", name = "PaymentByFlapRequest")
    public JAXBElement<DtoPaymentByFlapRequest> createPaymentByFlapRequest(DtoPaymentByFlapRequest value) {
        return new JAXBElement<DtoPaymentByFlapRequest>(_PaymentByFlapRequest_QNAME, DtoPaymentByFlapRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMoney }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:mzic:sendmoneymovements:facade:v01:dto", name = "Money")
    public JAXBElement<DtoMoney> createMoney(DtoMoney value) {
        return new JAXBElement<DtoMoney>(_Money_QNAME, DtoMoney.class, null, value);
    }

}
