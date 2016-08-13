
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

    private final static QName _ActualizarNotaPedido_QNAME = new QName("http://ejb.melani.com/", "actualizarNotaPedido");
    private final static QName _ActualizarNotaPedidoResponse_QNAME = new QName("http://ejb.melani.com/", "actualizarNotaPedidoResponse");
    private final static QName _AgregarNotaPedido_QNAME = new QName("http://ejb.melani.com/", "agregarNotaPedido");
    private final static QName _AgregarNotaPedidoResponse_QNAME = new QName("http://ejb.melani.com/", "agregarNotaPedidoResponse");
    private final static QName _AnularNotaPedido_QNAME = new QName("http://ejb.melani.com/", "anularNotaPedido");
    private final static QName _AnularNotaPedidoResponse_QNAME = new QName("http://ejb.melani.com/", "anularNotaPedidoResponse");
    private final static QName _CalcularVentasMensualesHastaFechaYAnoActual_QNAME = new QName("http://ejb.melani.com/", "calcularVentasMensualesHastaFechaYAnoActual");
    private final static QName _CalcularVentasMensualesHastaFechaYAnoActualResponse_QNAME = new QName("http://ejb.melani.com/", "calcularVentasMensualesHastaFechaYAnoActualResponse");
    private final static QName _CancelarNotaPedido_QNAME = new QName("http://ejb.melani.com/", "cancelarNotaPedido");
    private final static QName _CancelarNotaPedidoResponse_QNAME = new QName("http://ejb.melani.com/", "cancelarNotaPedidoResponse");
    private final static QName _EliminarNotaDePedido_QNAME = new QName("http://ejb.melani.com/", "eliminarNotaDePedido");
    private final static QName _EliminarNotaDePedidoResponse_QNAME = new QName("http://ejb.melani.com/", "eliminarNotaDePedidoResponse");
    private final static QName _EntregarNotaPedido_QNAME = new QName("http://ejb.melani.com/", "entregarNotaPedido");
    private final static QName _EntregarNotaPedidoResponse_QNAME = new QName("http://ejb.melani.com/", "entregarNotaPedidoResponse");
    private final static QName _GetRecorCountNotas_QNAME = new QName("http://ejb.melani.com/", "getRecorCountNotas");
    private final static QName _GetRecorCountNotasResponse_QNAME = new QName("http://ejb.melani.com/", "getRecorCountNotasResponse");
    private final static QName _SelectAllNotas_QNAME = new QName("http://ejb.melani.com/", "selectAllNotas");
    private final static QName _SelectAllNotasResponse_QNAME = new QName("http://ejb.melani.com/", "selectAllNotasResponse");
    private final static QName _SelectNotaEntreFechasCompra_QNAME = new QName("http://ejb.melani.com/", "selectNotaEntreFechasCompra");
    private final static QName _SelectNotaEntreFechasCompraResponse_QNAME = new QName("http://ejb.melani.com/", "selectNotaEntreFechasCompraResponse");
    private final static QName _SelectNotaEntreFechasEntrega_QNAME = new QName("http://ejb.melani.com/", "selectNotaEntreFechasEntrega");
    private final static QName _SelectNotaEntreFechasEntregaResponse_QNAME = new QName("http://ejb.melani.com/", "selectNotaEntreFechasEntregaResponse");
    private final static QName _SelectUnaNota_QNAME = new QName("http://ejb.melani.com/", "selectUnaNota");
    private final static QName _SelectUnaNotaResponse_QNAME = new QName("http://ejb.melani.com/", "selectUnaNotaResponse");
    private final static QName _VerNotasPedidoPaginadas_QNAME = new QName("http://ejb.melani.com/", "verNotasPedidoPaginadas");
    private final static QName _VerNotasPedidoPaginadasResponse_QNAME = new QName("http://ejb.melani.com/", "verNotasPedidoPaginadasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.melani.ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarNotaPedido }
     * 
     */
    public ActualizarNotaPedido createActualizarNotaPedido() {
        return new ActualizarNotaPedido();
    }

    /**
     * Create an instance of {@link ActualizarNotaPedidoResponse }
     * 
     */
    public ActualizarNotaPedidoResponse createActualizarNotaPedidoResponse() {
        return new ActualizarNotaPedidoResponse();
    }

    /**
     * Create an instance of {@link AgregarNotaPedido }
     * 
     */
    public AgregarNotaPedido createAgregarNotaPedido() {
        return new AgregarNotaPedido();
    }

    /**
     * Create an instance of {@link AgregarNotaPedidoResponse }
     * 
     */
    public AgregarNotaPedidoResponse createAgregarNotaPedidoResponse() {
        return new AgregarNotaPedidoResponse();
    }

    /**
     * Create an instance of {@link AnularNotaPedido }
     * 
     */
    public AnularNotaPedido createAnularNotaPedido() {
        return new AnularNotaPedido();
    }

    /**
     * Create an instance of {@link AnularNotaPedidoResponse }
     * 
     */
    public AnularNotaPedidoResponse createAnularNotaPedidoResponse() {
        return new AnularNotaPedidoResponse();
    }

    /**
     * Create an instance of {@link CalcularVentasMensualesHastaFechaYAnoActual }
     * 
     */
    public CalcularVentasMensualesHastaFechaYAnoActual createCalcularVentasMensualesHastaFechaYAnoActual() {
        return new CalcularVentasMensualesHastaFechaYAnoActual();
    }

    /**
     * Create an instance of {@link CalcularVentasMensualesHastaFechaYAnoActualResponse }
     * 
     */
    public CalcularVentasMensualesHastaFechaYAnoActualResponse createCalcularVentasMensualesHastaFechaYAnoActualResponse() {
        return new CalcularVentasMensualesHastaFechaYAnoActualResponse();
    }

    /**
     * Create an instance of {@link CancelarNotaPedido }
     * 
     */
    public CancelarNotaPedido createCancelarNotaPedido() {
        return new CancelarNotaPedido();
    }

    /**
     * Create an instance of {@link CancelarNotaPedidoResponse }
     * 
     */
    public CancelarNotaPedidoResponse createCancelarNotaPedidoResponse() {
        return new CancelarNotaPedidoResponse();
    }

    /**
     * Create an instance of {@link EliminarNotaDePedido }
     * 
     */
    public EliminarNotaDePedido createEliminarNotaDePedido() {
        return new EliminarNotaDePedido();
    }

    /**
     * Create an instance of {@link EliminarNotaDePedidoResponse }
     * 
     */
    public EliminarNotaDePedidoResponse createEliminarNotaDePedidoResponse() {
        return new EliminarNotaDePedidoResponse();
    }

    /**
     * Create an instance of {@link EntregarNotaPedido }
     * 
     */
    public EntregarNotaPedido createEntregarNotaPedido() {
        return new EntregarNotaPedido();
    }

    /**
     * Create an instance of {@link EntregarNotaPedidoResponse }
     * 
     */
    public EntregarNotaPedidoResponse createEntregarNotaPedidoResponse() {
        return new EntregarNotaPedidoResponse();
    }

    /**
     * Create an instance of {@link GetRecorCountNotas }
     * 
     */
    public GetRecorCountNotas createGetRecorCountNotas() {
        return new GetRecorCountNotas();
    }

    /**
     * Create an instance of {@link GetRecorCountNotasResponse }
     * 
     */
    public GetRecorCountNotasResponse createGetRecorCountNotasResponse() {
        return new GetRecorCountNotasResponse();
    }

    /**
     * Create an instance of {@link SelectAllNotas }
     * 
     */
    public SelectAllNotas createSelectAllNotas() {
        return new SelectAllNotas();
    }

    /**
     * Create an instance of {@link SelectAllNotasResponse }
     * 
     */
    public SelectAllNotasResponse createSelectAllNotasResponse() {
        return new SelectAllNotasResponse();
    }

    /**
     * Create an instance of {@link SelectNotaEntreFechasCompra }
     * 
     */
    public SelectNotaEntreFechasCompra createSelectNotaEntreFechasCompra() {
        return new SelectNotaEntreFechasCompra();
    }

    /**
     * Create an instance of {@link SelectNotaEntreFechasCompraResponse }
     * 
     */
    public SelectNotaEntreFechasCompraResponse createSelectNotaEntreFechasCompraResponse() {
        return new SelectNotaEntreFechasCompraResponse();
    }

    /**
     * Create an instance of {@link SelectNotaEntreFechasEntrega }
     * 
     */
    public SelectNotaEntreFechasEntrega createSelectNotaEntreFechasEntrega() {
        return new SelectNotaEntreFechasEntrega();
    }

    /**
     * Create an instance of {@link SelectNotaEntreFechasEntregaResponse }
     * 
     */
    public SelectNotaEntreFechasEntregaResponse createSelectNotaEntreFechasEntregaResponse() {
        return new SelectNotaEntreFechasEntregaResponse();
    }

    /**
     * Create an instance of {@link SelectUnaNota }
     * 
     */
    public SelectUnaNota createSelectUnaNota() {
        return new SelectUnaNota();
    }

    /**
     * Create an instance of {@link SelectUnaNotaResponse }
     * 
     */
    public SelectUnaNotaResponse createSelectUnaNotaResponse() {
        return new SelectUnaNotaResponse();
    }

    /**
     * Create an instance of {@link VerNotasPedidoPaginadas }
     * 
     */
    public VerNotasPedidoPaginadas createVerNotasPedidoPaginadas() {
        return new VerNotasPedidoPaginadas();
    }

    /**
     * Create an instance of {@link VerNotasPedidoPaginadasResponse }
     * 
     */
    public VerNotasPedidoPaginadasResponse createVerNotasPedidoPaginadasResponse() {
        return new VerNotasPedidoPaginadasResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarNotaPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "actualizarNotaPedido")
    public JAXBElement<ActualizarNotaPedido> createActualizarNotaPedido(ActualizarNotaPedido value) {
        return new JAXBElement<ActualizarNotaPedido>(_ActualizarNotaPedido_QNAME, ActualizarNotaPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarNotaPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "actualizarNotaPedidoResponse")
    public JAXBElement<ActualizarNotaPedidoResponse> createActualizarNotaPedidoResponse(ActualizarNotaPedidoResponse value) {
        return new JAXBElement<ActualizarNotaPedidoResponse>(_ActualizarNotaPedidoResponse_QNAME, ActualizarNotaPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarNotaPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "agregarNotaPedido")
    public JAXBElement<AgregarNotaPedido> createAgregarNotaPedido(AgregarNotaPedido value) {
        return new JAXBElement<AgregarNotaPedido>(_AgregarNotaPedido_QNAME, AgregarNotaPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarNotaPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "agregarNotaPedidoResponse")
    public JAXBElement<AgregarNotaPedidoResponse> createAgregarNotaPedidoResponse(AgregarNotaPedidoResponse value) {
        return new JAXBElement<AgregarNotaPedidoResponse>(_AgregarNotaPedidoResponse_QNAME, AgregarNotaPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnularNotaPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "anularNotaPedido")
    public JAXBElement<AnularNotaPedido> createAnularNotaPedido(AnularNotaPedido value) {
        return new JAXBElement<AnularNotaPedido>(_AnularNotaPedido_QNAME, AnularNotaPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnularNotaPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "anularNotaPedidoResponse")
    public JAXBElement<AnularNotaPedidoResponse> createAnularNotaPedidoResponse(AnularNotaPedidoResponse value) {
        return new JAXBElement<AnularNotaPedidoResponse>(_AnularNotaPedidoResponse_QNAME, AnularNotaPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularVentasMensualesHastaFechaYAnoActual }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "calcularVentasMensualesHastaFechaYAnoActual")
    public JAXBElement<CalcularVentasMensualesHastaFechaYAnoActual> createCalcularVentasMensualesHastaFechaYAnoActual(CalcularVentasMensualesHastaFechaYAnoActual value) {
        return new JAXBElement<CalcularVentasMensualesHastaFechaYAnoActual>(_CalcularVentasMensualesHastaFechaYAnoActual_QNAME, CalcularVentasMensualesHastaFechaYAnoActual.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularVentasMensualesHastaFechaYAnoActualResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "calcularVentasMensualesHastaFechaYAnoActualResponse")
    public JAXBElement<CalcularVentasMensualesHastaFechaYAnoActualResponse> createCalcularVentasMensualesHastaFechaYAnoActualResponse(CalcularVentasMensualesHastaFechaYAnoActualResponse value) {
        return new JAXBElement<CalcularVentasMensualesHastaFechaYAnoActualResponse>(_CalcularVentasMensualesHastaFechaYAnoActualResponse_QNAME, CalcularVentasMensualesHastaFechaYAnoActualResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarNotaPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "cancelarNotaPedido")
    public JAXBElement<CancelarNotaPedido> createCancelarNotaPedido(CancelarNotaPedido value) {
        return new JAXBElement<CancelarNotaPedido>(_CancelarNotaPedido_QNAME, CancelarNotaPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarNotaPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "cancelarNotaPedidoResponse")
    public JAXBElement<CancelarNotaPedidoResponse> createCancelarNotaPedidoResponse(CancelarNotaPedidoResponse value) {
        return new JAXBElement<CancelarNotaPedidoResponse>(_CancelarNotaPedidoResponse_QNAME, CancelarNotaPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarNotaDePedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "eliminarNotaDePedido")
    public JAXBElement<EliminarNotaDePedido> createEliminarNotaDePedido(EliminarNotaDePedido value) {
        return new JAXBElement<EliminarNotaDePedido>(_EliminarNotaDePedido_QNAME, EliminarNotaDePedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarNotaDePedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "eliminarNotaDePedidoResponse")
    public JAXBElement<EliminarNotaDePedidoResponse> createEliminarNotaDePedidoResponse(EliminarNotaDePedidoResponse value) {
        return new JAXBElement<EliminarNotaDePedidoResponse>(_EliminarNotaDePedidoResponse_QNAME, EliminarNotaDePedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntregarNotaPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "entregarNotaPedido")
    public JAXBElement<EntregarNotaPedido> createEntregarNotaPedido(EntregarNotaPedido value) {
        return new JAXBElement<EntregarNotaPedido>(_EntregarNotaPedido_QNAME, EntregarNotaPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntregarNotaPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "entregarNotaPedidoResponse")
    public JAXBElement<EntregarNotaPedidoResponse> createEntregarNotaPedidoResponse(EntregarNotaPedidoResponse value) {
        return new JAXBElement<EntregarNotaPedidoResponse>(_EntregarNotaPedidoResponse_QNAME, EntregarNotaPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecorCountNotas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "getRecorCountNotas")
    public JAXBElement<GetRecorCountNotas> createGetRecorCountNotas(GetRecorCountNotas value) {
        return new JAXBElement<GetRecorCountNotas>(_GetRecorCountNotas_QNAME, GetRecorCountNotas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecorCountNotasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "getRecorCountNotasResponse")
    public JAXBElement<GetRecorCountNotasResponse> createGetRecorCountNotasResponse(GetRecorCountNotasResponse value) {
        return new JAXBElement<GetRecorCountNotasResponse>(_GetRecorCountNotasResponse_QNAME, GetRecorCountNotasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAllNotas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "selectAllNotas")
    public JAXBElement<SelectAllNotas> createSelectAllNotas(SelectAllNotas value) {
        return new JAXBElement<SelectAllNotas>(_SelectAllNotas_QNAME, SelectAllNotas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAllNotasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "selectAllNotasResponse")
    public JAXBElement<SelectAllNotasResponse> createSelectAllNotasResponse(SelectAllNotasResponse value) {
        return new JAXBElement<SelectAllNotasResponse>(_SelectAllNotasResponse_QNAME, SelectAllNotasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectNotaEntreFechasCompra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "selectNotaEntreFechasCompra")
    public JAXBElement<SelectNotaEntreFechasCompra> createSelectNotaEntreFechasCompra(SelectNotaEntreFechasCompra value) {
        return new JAXBElement<SelectNotaEntreFechasCompra>(_SelectNotaEntreFechasCompra_QNAME, SelectNotaEntreFechasCompra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectNotaEntreFechasCompraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "selectNotaEntreFechasCompraResponse")
    public JAXBElement<SelectNotaEntreFechasCompraResponse> createSelectNotaEntreFechasCompraResponse(SelectNotaEntreFechasCompraResponse value) {
        return new JAXBElement<SelectNotaEntreFechasCompraResponse>(_SelectNotaEntreFechasCompraResponse_QNAME, SelectNotaEntreFechasCompraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectNotaEntreFechasEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "selectNotaEntreFechasEntrega")
    public JAXBElement<SelectNotaEntreFechasEntrega> createSelectNotaEntreFechasEntrega(SelectNotaEntreFechasEntrega value) {
        return new JAXBElement<SelectNotaEntreFechasEntrega>(_SelectNotaEntreFechasEntrega_QNAME, SelectNotaEntreFechasEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectNotaEntreFechasEntregaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "selectNotaEntreFechasEntregaResponse")
    public JAXBElement<SelectNotaEntreFechasEntregaResponse> createSelectNotaEntreFechasEntregaResponse(SelectNotaEntreFechasEntregaResponse value) {
        return new JAXBElement<SelectNotaEntreFechasEntregaResponse>(_SelectNotaEntreFechasEntregaResponse_QNAME, SelectNotaEntreFechasEntregaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectUnaNota }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "selectUnaNota")
    public JAXBElement<SelectUnaNota> createSelectUnaNota(SelectUnaNota value) {
        return new JAXBElement<SelectUnaNota>(_SelectUnaNota_QNAME, SelectUnaNota.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectUnaNotaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "selectUnaNotaResponse")
    public JAXBElement<SelectUnaNotaResponse> createSelectUnaNotaResponse(SelectUnaNotaResponse value) {
        return new JAXBElement<SelectUnaNotaResponse>(_SelectUnaNotaResponse_QNAME, SelectUnaNotaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerNotasPedidoPaginadas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "verNotasPedidoPaginadas")
    public JAXBElement<VerNotasPedidoPaginadas> createVerNotasPedidoPaginadas(VerNotasPedidoPaginadas value) {
        return new JAXBElement<VerNotasPedidoPaginadas>(_VerNotasPedidoPaginadas_QNAME, VerNotasPedidoPaginadas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerNotasPedidoPaginadasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.melani.com/", name = "verNotasPedidoPaginadasResponse")
    public JAXBElement<VerNotasPedidoPaginadasResponse> createVerNotasPedidoPaginadasResponse(VerNotasPedidoPaginadasResponse value) {
        return new JAXBElement<VerNotasPedidoPaginadasResponse>(_VerNotasPedidoPaginadasResponse_QNAME, VerNotasPedidoPaginadasResponse.class, null, value);
    }

}
