
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

    private final static QName _ShowReportPresupuesto_QNAME = new QName("http://ejb.melani.com/", "ShowReportPresupuesto");
    private final static QName _ShowReportPresupuestoResponse_QNAME = new QName("http://ejb.melani.com/", "ShowReportPresupuestoResponse");
    private final static QName _ShowReportVerPresupuesto_QNAME = new QName("http://ejb.melani.com/", "ShowReportVerPresupuesto");
    private final static QName _ShowReportVerPresupuestoResponse_QNAME = new QName("http://ejb.melani.com/", "ShowReportVerPresupuestoResponse");
    private final static QName _AddBudgets_QNAME = new QName("http://ejb.melani.com/", "addBudgets");
    private final static QName _AddBudgetsResponse_QNAME = new QName("http://ejb.melani.com/", "addBudgetsResponse");
    private final static QName _GetRecordCount_QNAME = new QName("http://ejb.melani.com/", "getRecordCount");
    private final static QName _GetRecordCountResponse_QNAME = new QName("http://ejb.melani.com/", "getRecordCountResponse");
    private final static QName _SearchOneBudget_QNAME = new QName("http://ejb.melani.com/", "searchOneBudget");
    private final static QName _SearchOneBudgetResponse_QNAME = new QName("http://ejb.melani.com/", "searchOneBudgetResponse");
    private final static QName _SelectAllPresupuestosJPA_QNAME = new QName("http://ejb.melani.com/", "selectAllPresupuestosJPA");
    private final static QName _SelectAllPresupuestosJPAResponse_QNAME = new QName("http://ejb.melani.com/", "selectAllPresupuestosJPAResponse");
    private final static QName _VerPresupuestosPaginados_QNAME = new QName("http://ejb.melani.com/", "verPresupuestosPaginados");
    private final static QName _VerPresupuestosPaginadosResponse_QNAME = new QName("http://ejb.melani.com/", "verPresupuestosPaginadosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.melani.ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShowReportPresupuesto }
     * 
     */
    public ShowReportPresupuesto createShowReportPresupuesto() {
        return new ShowReportPresupuesto();
    }

    /**
     * Create an instance of {@link ShowReportPresupuestoResponse }
     * 
     */
    public ShowReportPresupuestoResponse createShowReportPresupuestoResponse() {
        return new ShowReportPresupuestoResponse();
    }

    /**
     * Create an instance of {@link ShowReportVerPresupuesto }
     * 
     */
    public ShowReportVerPresupuesto createShowReportVerPresupuesto() {
        return new ShowReportVerPresupuesto();
    }

    /**
     * Create an instance of {@link ShowReportVerPresupuestoResponse }
     * 
     */
    public ShowReportVerPresupuestoResponse createShowReportVerPresupuestoResponse() {
        return new ShowReportVerPresupuestoResponse();
    }

    /**
     * Create an instance of {@link AddBudgets }
     * 
     */
    public AddBudgets createAddBudgets() {
        return new AddBudgets();
    }

    /**
     * Create an instance of {@link AddBudgetsResponse }
     * 
     */
    public AddBudgetsResponse createAddBudgetsResponse() {
        return new AddBudgetsResponse();
    }

    /**
     * Create an instance of {@link GetRecordCount }
     * 
     */
    public GetRecordCount createGetRecordCount() {
        return new GetRecordCount();
    }

    /**
     * Create an instance of {@link GetRecordCountResponse }
     * 
     */
    public GetRecordCountResponse createGetRecordCountResponse() {
        return new GetRecordCountResponse();
    }

    /**
     * Create an instance of {@link SearchOneBudget }
     * 
     */
    public SearchOneBudget createSearchOneBudget() {
        return new SearchOneBudget();
    }

    /**
     * Create an instance of {@link SearchOneBudgetResponse }
     * 
     */
    public SearchOneBudgetResponse createSearchOneBudgetResponse() {
        return new SearchOneBudgetResponse();
    }

    /**
     * Create an instance of {@link SelectAllPresupuestosJPA }
     * 
     */
    public SelectAllPresupuestosJPA createSelectAllPresupuestosJPA() {
        return new SelectAllPresupuestosJPA();
    }

    /**
     * Create an instance of {@link SelectAllPresupuestosJPAResponse }
     * 
     */
    public SelectAllPresupuestosJPAResponse createSelectAllPresupuestosJPAResponse() {
        return new SelectAllPresupuestosJPAResponse();
    }

    /**
     * Create an instance of {@link VerPresupuestosPaginados }
     * 
     */
    public VerPresupuestosPaginados createVerPresupuestosPaginados() {
        return new VerPresupuestosPaginados();
    }

    /**
     * Create an instance of {@link VerPresupuestosPaginadosResponse }
     * 
     */
    public VerPresupuestosPaginadosResponse createVerPresupuestosPaginadosResponse() {
        return new VerPresupuestosPaginadosResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowReportPresupuesto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "ShowReportPresupuesto")
    public JAXBElement<ShowReportPresupuesto> createShowReportPresupuesto(ShowReportPresupuesto value) {
        return new JAXBElement<ShowReportPresupuesto>(_ShowReportPresupuesto_QNAME, ShowReportPresupuesto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowReportPresupuestoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "ShowReportPresupuestoResponse")
    public JAXBElement<ShowReportPresupuestoResponse> createShowReportPresupuestoResponse(ShowReportPresupuestoResponse value) {
        return new JAXBElement<ShowReportPresupuestoResponse>(_ShowReportPresupuestoResponse_QNAME, ShowReportPresupuestoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowReportVerPresupuesto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "ShowReportVerPresupuesto")
    public JAXBElement<ShowReportVerPresupuesto> createShowReportVerPresupuesto(ShowReportVerPresupuesto value) {
        return new JAXBElement<ShowReportVerPresupuesto>(_ShowReportVerPresupuesto_QNAME, ShowReportVerPresupuesto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowReportVerPresupuestoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "ShowReportVerPresupuestoResponse")
    public JAXBElement<ShowReportVerPresupuestoResponse> createShowReportVerPresupuestoResponse(ShowReportVerPresupuestoResponse value) {
        return new JAXBElement<ShowReportVerPresupuestoResponse>(_ShowReportVerPresupuestoResponse_QNAME, ShowReportVerPresupuestoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBudgets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "addBudgets")
    public JAXBElement<AddBudgets> createAddBudgets(AddBudgets value) {
        return new JAXBElement<AddBudgets>(_AddBudgets_QNAME, AddBudgets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBudgetsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "addBudgetsResponse")
    public JAXBElement<AddBudgetsResponse> createAddBudgetsResponse(AddBudgetsResponse value) {
        return new JAXBElement<AddBudgetsResponse>(_AddBudgetsResponse_QNAME, AddBudgetsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecordCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "getRecordCount")
    public JAXBElement<GetRecordCount> createGetRecordCount(GetRecordCount value) {
        return new JAXBElement<GetRecordCount>(_GetRecordCount_QNAME, GetRecordCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecordCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "getRecordCountResponse")
    public JAXBElement<GetRecordCountResponse> createGetRecordCountResponse(GetRecordCountResponse value) {
        return new JAXBElement<GetRecordCountResponse>(_GetRecordCountResponse_QNAME, GetRecordCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchOneBudget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "searchOneBudget")
    public JAXBElement<SearchOneBudget> createSearchOneBudget(SearchOneBudget value) {
        return new JAXBElement<SearchOneBudget>(_SearchOneBudget_QNAME, SearchOneBudget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchOneBudgetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "searchOneBudgetResponse")
    public JAXBElement<SearchOneBudgetResponse> createSearchOneBudgetResponse(SearchOneBudgetResponse value) {
        return new JAXBElement<SearchOneBudgetResponse>(_SearchOneBudgetResponse_QNAME, SearchOneBudgetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAllPresupuestosJPA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "selectAllPresupuestosJPA")
    public JAXBElement<SelectAllPresupuestosJPA> createSelectAllPresupuestosJPA(SelectAllPresupuestosJPA value) {
        return new JAXBElement<SelectAllPresupuestosJPA>(_SelectAllPresupuestosJPA_QNAME, SelectAllPresupuestosJPA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAllPresupuestosJPAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "selectAllPresupuestosJPAResponse")
    public JAXBElement<SelectAllPresupuestosJPAResponse> createSelectAllPresupuestosJPAResponse(SelectAllPresupuestosJPAResponse value) {
        return new JAXBElement<SelectAllPresupuestosJPAResponse>(_SelectAllPresupuestosJPAResponse_QNAME, SelectAllPresupuestosJPAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerPresupuestosPaginados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "verPresupuestosPaginados")
    public JAXBElement<VerPresupuestosPaginados> createVerPresupuestosPaginados(VerPresupuestosPaginados value) {
        return new JAXBElement<VerPresupuestosPaginados>(_VerPresupuestosPaginados_QNAME, VerPresupuestosPaginados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerPresupuestosPaginadosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "verPresupuestosPaginadosResponse")
    public JAXBElement<VerPresupuestosPaginadosResponse> createVerPresupuestosPaginadosResponse(VerPresupuestosPaginadosResponse value) {
        return new JAXBElement<VerPresupuestosPaginadosResponse>(_VerPresupuestosPaginadosResponse_QNAME, VerPresupuestosPaginadosResponse.class, null, value);
    }

}
