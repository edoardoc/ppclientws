/**
 * Rubricapp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.datasynaptic.portaportese;

public class Rubricapp  implements java.io.Serializable {
    private com.datasynaptic.portaportese.Rubrictiprec codicerubrica;

    private java.lang.String descrizione;

    private com.datasynaptic.portaportese.Filtro[] filtri;

    private com.datasynaptic.portaportese.Tipologia[] tipologie;

    public Rubricapp() {
    }

    public Rubricapp(
           com.datasynaptic.portaportese.Rubrictiprec codicerubrica,
           java.lang.String descrizione,
           com.datasynaptic.portaportese.Filtro[] filtri,
           com.datasynaptic.portaportese.Tipologia[] tipologie) {
           this.codicerubrica = codicerubrica;
           this.descrizione = descrizione;
           this.filtri = filtri;
           this.tipologie = tipologie;
    }


    /**
     * Gets the codicerubrica value for this Rubricapp.
     * 
     * @return codicerubrica
     */
    public com.datasynaptic.portaportese.Rubrictiprec getCodicerubrica() {
        return codicerubrica;
    }


    /**
     * Sets the codicerubrica value for this Rubricapp.
     * 
     * @param codicerubrica
     */
    public void setCodicerubrica(com.datasynaptic.portaportese.Rubrictiprec codicerubrica) {
        this.codicerubrica = codicerubrica;
    }


    /**
     * Gets the descrizione value for this Rubricapp.
     * 
     * @return descrizione
     */
    public java.lang.String getDescrizione() {
        return descrizione;
    }


    /**
     * Sets the descrizione value for this Rubricapp.
     * 
     * @param descrizione
     */
    public void setDescrizione(java.lang.String descrizione) {
        this.descrizione = descrizione;
    }


    /**
     * Gets the filtri value for this Rubricapp.
     * 
     * @return filtri
     */
    public com.datasynaptic.portaportese.Filtro[] getFiltri() {
        return filtri;
    }


    /**
     * Sets the filtri value for this Rubricapp.
     * 
     * @param filtri
     */
    public void setFiltri(com.datasynaptic.portaportese.Filtro[] filtri) {
        this.filtri = filtri;
    }

    public com.datasynaptic.portaportese.Filtro getFiltri(int i) {
        return this.filtri[i];
    }

    public void setFiltri(int i, com.datasynaptic.portaportese.Filtro _value) {
        this.filtri[i] = _value;
    }


    /**
     * Gets the tipologie value for this Rubricapp.
     * 
     * @return tipologie
     */
    public com.datasynaptic.portaportese.Tipologia[] getTipologie() {
        return tipologie;
    }


    /**
     * Sets the tipologie value for this Rubricapp.
     * 
     * @param tipologie
     */
    public void setTipologie(com.datasynaptic.portaportese.Tipologia[] tipologie) {
        this.tipologie = tipologie;
    }

    public com.datasynaptic.portaportese.Tipologia getTipologie(int i) {
        return this.tipologie[i];
    }

    public void setTipologie(int i, com.datasynaptic.portaportese.Tipologia _value) {
        this.tipologie[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rubricapp)) return false;
        Rubricapp other = (Rubricapp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codicerubrica==null && other.getCodicerubrica()==null) || 
             (this.codicerubrica!=null &&
              this.codicerubrica.equals(other.getCodicerubrica()))) &&
            ((this.descrizione==null && other.getDescrizione()==null) || 
             (this.descrizione!=null &&
              this.descrizione.equals(other.getDescrizione()))) &&
            ((this.filtri==null && other.getFiltri()==null) || 
             (this.filtri!=null &&
              java.util.Arrays.equals(this.filtri, other.getFiltri()))) &&
            ((this.tipologie==null && other.getTipologie()==null) || 
             (this.tipologie!=null &&
              java.util.Arrays.equals(this.tipologie, other.getTipologie())));
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
        if (getCodicerubrica() != null) {
            _hashCode += getCodicerubrica().hashCode();
        }
        if (getDescrizione() != null) {
            _hashCode += getDescrizione().hashCode();
        }
        if (getFiltri() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFiltri());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFiltri(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTipologie() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTipologie());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTipologie(), i);
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
        new org.apache.axis.description.TypeDesc(Rubricapp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "rubricapp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codicerubrica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "codicerubrica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "rubrictiprec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "descrizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filtri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "filtri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "filtro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipologie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "tipologie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "tipologia"));
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
