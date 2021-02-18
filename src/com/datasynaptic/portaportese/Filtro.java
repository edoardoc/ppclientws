/**
 * Filtro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.datasynaptic.portaportese;

public class Filtro  implements java.io.Serializable {
    private java.lang.String cod;

    private java.lang.String des;

    public Filtro() {
    }

    public Filtro(
           java.lang.String cod,
           java.lang.String des) {
           this.cod = cod;
           this.des = des;
    }


    /**
     * Gets the cod value for this Filtro.
     * 
     * @return cod
     */
    public java.lang.String getCod() {
        return cod;
    }


    /**
     * Sets the cod value for this Filtro.
     * 
     * @param cod
     */
    public void setCod(java.lang.String cod) {
        this.cod = cod;
    }


    /**
     * Gets the des value for this Filtro.
     * 
     * @return des
     */
    public java.lang.String getDes() {
        return des;
    }


    /**
     * Sets the des value for this Filtro.
     * 
     * @param des
     */
    public void setDes(java.lang.String des) {
        this.des = des;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Filtro)) return false;
        Filtro other = (Filtro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cod==null && other.getCod()==null) || 
             (this.cod!=null &&
              this.cod.equals(other.getCod()))) &&
            ((this.des==null && other.getDes()==null) || 
             (this.des!=null &&
              this.des.equals(other.getDes())));
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
        if (getCod() != null) {
            _hashCode += getCod().hashCode();
        }
        if (getDes() != null) {
            _hashCode += getDes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Filtro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "filtro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "cod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("des");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "des"));
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
