/**
 * Datinuovoannunciopp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.datasynaptic.portaportese;

public class Datinuovoannunciopp  implements java.io.Serializable {
    private int codicecliente;

    private com.datasynaptic.portaportese.Annuncioppins annuncio;

    private java.lang.String auth;

    private byte[][] immagine;

    private byte[] video;

    public Datinuovoannunciopp() {
    }

    public Datinuovoannunciopp(
           int codicecliente,
           com.datasynaptic.portaportese.Annuncioppins annuncio,
           java.lang.String auth,
           byte[][] immagine,
           byte[] video) {
           this.codicecliente = codicecliente;
           this.annuncio = annuncio;
           this.auth = auth;
           this.immagine = immagine;
           this.video = video;
    }


    /**
     * Gets the codicecliente value for this Datinuovoannunciopp.
     * 
     * @return codicecliente
     */
    public int getCodicecliente() {
        return codicecliente;
    }


    /**
     * Sets the codicecliente value for this Datinuovoannunciopp.
     * 
     * @param codicecliente
     */
    public void setCodicecliente(int codicecliente) {
        this.codicecliente = codicecliente;
    }


    /**
     * Gets the annuncio value for this Datinuovoannunciopp.
     * 
     * @return annuncio
     */
    public com.datasynaptic.portaportese.Annuncioppins getAnnuncio() {
        return annuncio;
    }


    /**
     * Sets the annuncio value for this Datinuovoannunciopp.
     * 
     * @param annuncio
     */
    public void setAnnuncio(com.datasynaptic.portaportese.Annuncioppins annuncio) {
        this.annuncio = annuncio;
    }


    /**
     * Gets the auth value for this Datinuovoannunciopp.
     * 
     * @return auth
     */
    public java.lang.String getAuth() {
        return auth;
    }


    /**
     * Sets the auth value for this Datinuovoannunciopp.
     * 
     * @param auth
     */
    public void setAuth(java.lang.String auth) {
        this.auth = auth;
    }


    /**
     * Gets the immagine value for this Datinuovoannunciopp.
     * 
     * @return immagine
     */
    public byte[][] getImmagine() {
        return immagine;
    }


    /**
     * Sets the immagine value for this Datinuovoannunciopp.
     * 
     * @param immagine
     */
    public void setImmagine(byte[][] immagine) {
        this.immagine = immagine;
    }

    public byte[] getImmagine(int i) {
        return this.immagine[i];
    }

    public void setImmagine(int i, byte[] _value) {
        this.immagine[i] = _value;
    }


    /**
     * Gets the video value for this Datinuovoannunciopp.
     * 
     * @return video
     */
    public byte[] getVideo() {
        return video;
    }


    /**
     * Sets the video value for this Datinuovoannunciopp.
     * 
     * @param video
     */
    public void setVideo(byte[] video) {
        this.video = video;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Datinuovoannunciopp)) return false;
        Datinuovoannunciopp other = (Datinuovoannunciopp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codicecliente == other.getCodicecliente() &&
            ((this.annuncio==null && other.getAnnuncio()==null) || 
             (this.annuncio!=null &&
              this.annuncio.equals(other.getAnnuncio()))) &&
            ((this.auth==null && other.getAuth()==null) || 
             (this.auth!=null &&
              this.auth.equals(other.getAuth()))) &&
            ((this.immagine==null && other.getImmagine()==null) || 
             (this.immagine!=null &&
              java.util.Arrays.equals(this.immagine, other.getImmagine()))) &&
            ((this.video==null && other.getVideo()==null) || 
             (this.video!=null &&
              java.util.Arrays.equals(this.video, other.getVideo())));
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
        _hashCode += getCodicecliente();
        if (getAnnuncio() != null) {
            _hashCode += getAnnuncio().hashCode();
        }
        if (getAuth() != null) {
            _hashCode += getAuth().hashCode();
        }
        if (getImmagine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImmagine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImmagine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVideo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVideo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVideo(), i);
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
        new org.apache.axis.description.TypeDesc(Datinuovoannunciopp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", ">datinuovoannunciopp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codicecliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "codicecliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annuncio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "annuncio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "annuncioppins"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "auth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("immagine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "immagine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("video");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "video"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
