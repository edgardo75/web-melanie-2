
package com.melani.ejb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.melani.ejb package. 
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

    private final static QName _AddBarrio_QNAME = new QName("http://ejb.melani.com/", "addBarrio");
    private final static QName _AddBarrioResponse_QNAME = new QName("http://ejb.melani.com/", "addBarrioResponse");
    private final static QName _RecordCountBarrios_QNAME = new QName("http://ejb.melani.com/", "recordCountBarrios");
    private final static QName _RecordCountBarriosResponse_QNAME = new QName("http://ejb.melani.com/", "recordCountBarriosResponse");
    private final static QName _SearchAllBarrios_QNAME = new QName("http://ejb.melani.com/", "searchAllBarrios");
    private final static QName _SearchAllBarriosResponse_QNAME = new QName("http://ejb.melani.com/", "searchAllBarriosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.melani.ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddBarrio }
     * 
     */
    public AddBarrio createAddBarrio() {
        return new AddBarrio();
    }

    /**
     * Create an instance of {@link AddBarrioResponse }
     * 
     */
    public AddBarrioResponse createAddBarrioResponse() {
        return new AddBarrioResponse();
    }

    /**
     * Create an instance of {@link RecordCountBarrios }
     * 
     */
    public RecordCountBarrios createRecordCountBarrios() {
        return new RecordCountBarrios();
    }

    /**
     * Create an instance of {@link RecordCountBarriosResponse }
     * 
     */
    public RecordCountBarriosResponse createRecordCountBarriosResponse() {
        return new RecordCountBarriosResponse();
    }

    /**
     * Create an instance of {@link SearchAllBarrios }
     * 
     */
    public SearchAllBarrios createSearchAllBarrios() {
        return new SearchAllBarrios();
    }

    /**
     * Create an instance of {@link SearchAllBarriosResponse }
     * 
     */
    public SearchAllBarriosResponse createSearchAllBarriosResponse() {
        return new SearchAllBarriosResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBarrio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "addBarrio")
    public JAXBElement<AddBarrio> createAddBarrio(AddBarrio value) {
        return new JAXBElement<AddBarrio>(_AddBarrio_QNAME, AddBarrio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBarrioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "addBarrioResponse")
    public JAXBElement<AddBarrioResponse> createAddBarrioResponse(AddBarrioResponse value) {
        return new JAXBElement<AddBarrioResponse>(_AddBarrioResponse_QNAME, AddBarrioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordCountBarrios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "recordCountBarrios")
    public JAXBElement<RecordCountBarrios> createRecordCountBarrios(RecordCountBarrios value) {
        return new JAXBElement<RecordCountBarrios>(_RecordCountBarrios_QNAME, RecordCountBarrios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordCountBarriosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "recordCountBarriosResponse")
    public JAXBElement<RecordCountBarriosResponse> createRecordCountBarriosResponse(RecordCountBarriosResponse value) {
        return new JAXBElement<RecordCountBarriosResponse>(_RecordCountBarriosResponse_QNAME, RecordCountBarriosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAllBarrios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "searchAllBarrios")
    public JAXBElement<SearchAllBarrios> createSearchAllBarrios(SearchAllBarrios value) {
        return new JAXBElement<SearchAllBarrios>(_SearchAllBarrios_QNAME, SearchAllBarrios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAllBarriosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "searchAllBarriosResponse")
    public JAXBElement<SearchAllBarriosResponse> createSearchAllBarriosResponse(SearchAllBarriosResponse value) {
        return new JAXBElement<SearchAllBarriosResponse>(_SearchAllBarriosResponse_QNAME, SearchAllBarriosResponse.class, null, value);
    }

}
