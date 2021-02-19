/**
 * PortaPorteseServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.datasynaptic.portaportese;

public class PortaPorteseServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.datasynaptic.portaportese.PortaPorteseServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modificaAnnunciopp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "datimodificaannunciopp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", ">datimodificaannunciopp"), com.datasynaptic.portaportese.Datimodificaannunciopp.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", ">modannunciopp"));
        oper.setReturnClass(com.datasynaptic.portaportese.Modannunciopp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "modannunciopp"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciAnnunciopp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "datinuovoannunciopp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", ">datinuovoannunciopp"), com.datasynaptic.portaportese.Datinuovoannunciopp.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", ">nuovoannunciopp"));
        oper.setReturnClass(com.datasynaptic.portaportese.Nuovoannunciopp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "nuovoannunciopp"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancellaAnnunciopp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "datiselannunciopp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", ">datiselannunciopp"), com.datasynaptic.portaportese.Datiselannunciopp.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", ">delannunciopp"));
        oper.setReturnClass(com.datasynaptic.portaportese.Delannunciopp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "delannunciopp"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

    }

    public PortaPorteseServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PortaPorteseServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PortaPorteseServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", ">datimodificaannunciopp");
            cachedSerQNames.add(qName);
            cls = com.datasynaptic.portaportese.Datimodificaannunciopp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", ">datinuovoannunciopp");
            cachedSerQNames.add(qName);
            cls = com.datasynaptic.portaportese.Datinuovoannunciopp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", ">datiselannunciopp");
            cachedSerQNames.add(qName);
            cls = com.datasynaptic.portaportese.Datiselannunciopp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", ">delannunciopp");
            cachedSerQNames.add(qName);
            cls = com.datasynaptic.portaportese.Delannunciopp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", ">modannunciopp");
            cachedSerQNames.add(qName);
            cls = com.datasynaptic.portaportese.Modannunciopp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", ">nuovoannunciopp");
            cachedSerQNames.add(qName);
            cls = com.datasynaptic.portaportese.Nuovoannunciopp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "annuncioppins");
            cachedSerQNames.add(qName);
            cls = com.datasynaptic.portaportese.Annuncioppins.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "errorecampo");
            cachedSerQNames.add(qName);
            cls = com.datasynaptic.portaportese.Errorecampo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "filtro");
            cachedSerQNames.add(qName);
            cls = com.datasynaptic.portaportese.Filtro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "risultato");
            cachedSerQNames.add(qName);
            cls = com.datasynaptic.portaportese.Risultato.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "rubricapp");
            cachedSerQNames.add(qName);
            cls = com.datasynaptic.portaportese.Rubricapp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "rubrictiprec");
            cachedSerQNames.add(qName);
            cls = com.datasynaptic.portaportese.Rubrictiprec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "stato");
            cachedSerQNames.add(qName);
            cls = com.datasynaptic.portaportese.Stato.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "tipologia");
            cachedSerQNames.add(qName);
            cls = com.datasynaptic.portaportese.Tipologia.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2005/05/xmlmime", ">contentType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.w3.org/2005/05/xmlmime", "base64Binary");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2005._05.xmlmime.Base64Binary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.w3.org/2005/05/xmlmime", "hexBinary");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2005._05.xmlmime.HexBinary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Exception _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.datasynaptic.portaportese.Modannunciopp modificaAnnunciopp(com.datasynaptic.portaportese.Datimodificaannunciopp parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://datasynaptic.com/portaportese/modificaAnnuncio");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "modificaAnnunciopp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasynaptic.portaportese.Modannunciopp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasynaptic.portaportese.Modannunciopp) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasynaptic.portaportese.Modannunciopp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.datasynaptic.portaportese.Nuovoannunciopp inserisciAnnunciopp(com.datasynaptic.portaportese.Datinuovoannunciopp parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://datasynaptic.com/portaportese/inserisciAnnuncio");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inserisciAnnunciopp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasynaptic.portaportese.Nuovoannunciopp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasynaptic.portaportese.Nuovoannunciopp) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasynaptic.portaportese.Nuovoannunciopp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.datasynaptic.portaportese.Delannunciopp cancellaAnnunciopp(com.datasynaptic.portaportese.Datiselannunciopp parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://datasynaptic.com/portaportese/cancellaAnnuncio");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cancellaAnnunciopp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.datasynaptic.portaportese.Delannunciopp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.datasynaptic.portaportese.Delannunciopp) org.apache.axis.utils.JavaUtils.convert(_resp, com.datasynaptic.portaportese.Delannunciopp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
