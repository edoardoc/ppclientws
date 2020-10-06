/**
 * Datiselannunciopp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.datasynaptic.portaportese;

public class Datiselannunciopp  implements java.io.Serializable {
    private int kannuncio;

    private int codicecliente;

    private java.lang.String auth;

    public Datiselannunciopp() {
    }

    public Datiselannunciopp(
           int kannuncio,
           int codicecliente,
           java.lang.String auth) {
           this.kannuncio = kannuncio;
           this.codicecliente = codicecliente;
           this.auth = auth;
    }


    /**
     * Gets the kannuncio value for this Datiselannunciopp.
     * 
     * @return kannuncio
     */
    public int getKannuncio() {
        return kannuncio;
    }


    /**
     * Sets the kannuncio value for this Datiselannunciopp.
     * 
     * @param kannuncio
     */
    public void setKannuncio(int kannuncio) {
        this.kannuncio = kannuncio;
    }


    /**
     * Gets the codicecliente value for this Datiselannunciopp.
     * 
     * @return codicecliente
     */
    public int getCodicecliente() {
        return codicecliente;
    }


    /**
     * Sets the codicecliente value for this Datiselannunciopp.
     * 
     * @param codicecliente
     */
    public void setCodicecliente(int codicecliente) {
        this.codicecliente = codicecliente;
    }


    /**
     * Gets the auth value for this Datiselannunciopp.
     * 
     * @return auth
     */
    public java.lang.String getAuth() {
        return auth;
    }


    /**
     * Sets the auth value for this Datiselannunciopp.
     * 
     * @param auth
     */
    public void setAuth(java.lang.String auth) {
        this.auth = auth;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Datiselannunciopp)) return false;
        Datiselannunciopp other = (Datiselannunciopp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.kannuncio == other.getKannuncio() &&
            this.codicecliente == other.getCodicecliente() &&
            ((this.auth==null && other.getAuth()==null) || 
             (this.auth!=null &&
              this.auth.equals(other.getAuth())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getKannuncio();
        _hashCode += getCodicecliente();
        if (getAuth() != null) {
            _hashCode += getAuth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Datiselannunciopp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", ">datiselannunciopp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kannuncio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "kannuncio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codicecliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "codicecliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "auth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
