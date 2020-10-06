/**
 * Delannunciopp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.datasynaptic.portaportese;

public class Delannunciopp  implements java.io.Serializable {
    private com.datasynaptic.portaportese.Risultato esito;

    private com.datasynaptic.portaportese.Errorecampo[] errori;

    public Delannunciopp() {
    }

    public Delannunciopp(
           com.datasynaptic.portaportese.Risultato esito,
           com.datasynaptic.portaportese.Errorecampo[] errori) {
           this.esito = esito;
           this.errori = errori;
    }


    /**
     * Gets the esito value for this Delannunciopp.
     * 
     * @return esito
     */
    public com.datasynaptic.portaportese.Risultato getEsito() {
        return esito;
    }


    /**
     * Sets the esito value for this Delannunciopp.
     * 
     * @param esito
     */
    public void setEsito(com.datasynaptic.portaportese.Risultato esito) {
        this.esito = esito;
    }


    /**
     * Gets the errori value for this Delannunciopp.
     * 
     * @return errori
     */
    public com.datasynaptic.portaportese.Errorecampo[] getErrori() {
        return errori;
    }


    /**
     * Sets the errori value for this Delannunciopp.
     * 
     * @param errori
     */
    public void setErrori(com.datasynaptic.portaportese.Errorecampo[] errori) {
        this.errori = errori;
    }

    public com.datasynaptic.portaportese.Errorecampo getErrori(int i) {
        return this.errori[i];
    }

    public void setErrori(int i, com.datasynaptic.portaportese.Errorecampo _value) {
        this.errori[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Delannunciopp)) return false;
        Delannunciopp other = (Delannunciopp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.esito==null && other.getEsito()==null) || 
             (this.esito!=null &&
              this.esito.equals(other.getEsito()))) &&
            ((this.errori==null && other.getErrori()==null) || 
             (this.errori!=null &&
              java.util.Arrays.equals(this.errori, other.getErrori())));
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
        if (getEsito() != null) {
            _hashCode += getEsito().hashCode();
        }
        if (getErrori() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrori());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrori(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Delannunciopp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", ">delannunciopp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "esito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "risultato"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errori");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "errori"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "errorecampo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
