
package com.melani.ejb;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicesPresupuestos", targetNamespace = "http://ejb.melani.com/", wsdlLocation = "http://192.168.1.101:8080/ServicesPresupuestos/PresupuestoWs?WSDL")
public class ServicesPresupuestos
    extends Service
{

    private final static URL SERVICESPRESUPUESTOS_WSDL_LOCATION;
    private final static WebServiceException SERVICESPRESUPUESTOS_EXCEPTION;
    private final static QName SERVICESPRESUPUESTOS_QNAME = new QName("http://ejb.melani.com/", "ServicesPresupuestos");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.1.101:8080/ServicesPresupuestos/PresupuestoWs?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICESPRESUPUESTOS_WSDL_LOCATION = url;
        SERVICESPRESUPUESTOS_EXCEPTION = e;
    }

    public ServicesPresupuestos() {
        super(__getWsdlLocation(), SERVICESPRESUPUESTOS_QNAME);
    }

    public ServicesPresupuestos(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICESPRESUPUESTOS_QNAME, features);
    }

    public ServicesPresupuestos(URL wsdlLocation) {
        super(wsdlLocation, SERVICESPRESUPUESTOS_QNAME);
    }

    public ServicesPresupuestos(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICESPRESUPUESTOS_QNAME, features);
    }

    public ServicesPresupuestos(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicesPresupuestos(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PresupuestoWs
     */
    @WebEndpoint(name = "PresupuestoWsPort")
    public PresupuestoWs getPresupuestoWsPort() {
        return super.getPort(new QName("http://ejb.melani.com/", "PresupuestoWsPort"), PresupuestoWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PresupuestoWs
     */
    @WebEndpoint(name = "PresupuestoWsPort")
    public PresupuestoWs getPresupuestoWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ejb.melani.com/", "PresupuestoWsPort"), PresupuestoWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICESPRESUPUESTOS_EXCEPTION!= null) {
            throw SERVICESPRESUPUESTOS_EXCEPTION;
        }
        return SERVICESPRESUPUESTOS_WSDL_LOCATION;
    }

}
