/**
 * Rubrictiprec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.datasynaptic.portaportese;

public class Rubrictiprec  implements java.io.Serializable {
    private java.lang.String rubric;

    private java.lang.String tiprec;

    public Rubrictiprec() {
    }

    public Rubrictiprec(
           java.lang.String rubric,
           java.lang.String tiprec) {
           this.rubric = rubric;
           this.tiprec = tiprec;
    }


    /**
     * Gets the rubric value for this Rubrictiprec.
     * 
     * @return rubric
     */
    public java.lang.String getRubric() {
        return rubric;
    }


    /**
     * Sets the rubric value for this Rubrictiprec.
     * 
     * @param rubric
     */
    public void setRubric(java.lang.String rubric) {
        this.rubric = rubric;
    }


    /**
     * Gets the tiprec value for this Rubrictiprec.
     * 
     * @return tiprec
     */
    public java.lang.String getTiprec() {
        return tiprec;
    }


    /**
     * Sets the tiprec value for this Rubrictiprec.
     * 
     * @param tiprec
     */
    public void setTiprec(java.lang.String tiprec) {
        this.tiprec = tiprec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rubrictiprec)) return false;
        Rubrictiprec other = (Rubrictiprec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rubric==null && other.getRubric()==null) || 
             (this.rubric!=null &&
              this.rubric.equals(other.getRubric()))) &&
            ((this.tiprec==null && other.getTiprec()==null) || 
             (this.tiprec!=null &&
              this.tiprec.equals(other.getTiprec())));
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
        if (getRubric() != null) {
            _hashCode += getRubric().hashCode();
        }
        if (getTiprec() != null) {
            _hashCode += getTiprec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rubrictiprec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "rubrictiprec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rubric");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "rubric"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tiprec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "tiprec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
