//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.03 at 11:16:20 PM EEST 
//


package xsd.jaxb.reply;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xsd.jaxb.reply package. 
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

    private final static QName _Reply_QNAME = new QName("http://www.example.org/input", "reply");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xsd.jaxb.reply
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReplyType }
     * 
     */
    public ReplyType createReplyType() {
        return new ReplyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/input", name = "reply")
    public JAXBElement<ReplyType> createReply(ReplyType value) {
        return new JAXBElement<ReplyType>(_Reply_QNAME, ReplyType.class, null, value);
    }

}
