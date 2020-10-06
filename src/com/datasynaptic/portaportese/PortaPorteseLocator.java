/**
 * PortaPorteseLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.datasynaptic.portaportese;

public class PortaPorteseLocator extends org.apache.axis.client.Service implements com.datasynaptic.portaportese.PortaPortese {

    public PortaPorteseLocator() {
    }


    public PortaPorteseLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PortaPorteseLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PortaPorteseServiceSoap
    private java.lang.String PortaPorteseServiceSoap_address = "http://stage.data.portaportese.it:80/PortaPorteseServiceSoap";

    public java.lang.String getPortaPorteseServiceSoapAddress() {
        return PortaPorteseServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PortaPorteseServiceSoapWSDDServiceName = "PortaPorteseServiceSoap";

    public java.lang.String getPortaPorteseServiceSoapWSDDServiceName() {
        return PortaPorteseServiceSoapWSDDServiceName;
    }

    public void setPortaPorteseServiceSoapWSDDServiceName(java.lang.String name) {
        PortaPorteseServiceSoapWSDDServiceName = name;
    }

    public com.datasynaptic.portaportese.PortaPorteseServiceSoap getPortaPorteseServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PortaPorteseServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortaPorteseServiceSoap(endpoint);
    }

    public com.datasynaptic.portaportese.PortaPorteseServiceSoap getPortaPorteseServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.datasynaptic.portaportese.PortaPorteseServiceSoapBindingStub _stub = new com.datasynaptic.portaportese.PortaPorteseServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPortaPorteseServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortaPorteseServiceSoapEndpointAddress(java.lang.String address) {
        PortaPorteseServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.datasynaptic.portaportese.PortaPorteseServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.datasynaptic.portaportese.PortaPorteseServiceSoapBindingStub _stub = new com.datasynaptic.portaportese.PortaPorteseServiceSoapBindingStub(new java.net.URL(PortaPorteseServiceSoap_address), this);
                _stub.setPortName(getPortaPorteseServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PortaPorteseServiceSoap".equals(inputPortName)) {
            return getPortaPorteseServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "PortaPortese");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "PortaPorteseServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PortaPorteseServiceSoap".equals(portName)) {
            setPortaPorteseServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
