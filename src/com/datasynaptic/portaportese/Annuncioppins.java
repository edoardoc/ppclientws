/**
 * Annuncioppins.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.datasynaptic.portaportese;

public class Annuncioppins  implements java.io.Serializable {
    private int idcategoria;

    private java.lang.String titolo;

    private java.lang.String descrizioneLunga;

    private java.lang.Integer prezzo;

    private java.lang.String telefono;

    private java.lang.String cellulare;

    private java.lang.String caratteristiche;

    private java.lang.Boolean pubblicaemail;

    private java.lang.Double latitudine;

    private java.lang.Double longitudine;

    public Annuncioppins() {
    }

    public Annuncioppins(
           int idcategoria,
           java.lang.String titolo,
           java.lang.String descrizioneLunga,
           java.lang.Integer prezzo,
           java.lang.String telefono,
           java.lang.String cellulare,
           java.lang.String caratteristiche,
           java.lang.Boolean pubblicaemail,
           java.lang.Double latitudine,
           java.lang.Double longitudine) {
           this.idcategoria = idcategoria;
           this.titolo = titolo;
           this.descrizioneLunga = descrizioneLunga;
           this.prezzo = prezzo;
           this.telefono = telefono;
           this.cellulare = cellulare;
           this.caratteristiche = caratteristiche;
           this.pubblicaemail = pubblicaemail;
           this.latitudine = latitudine;
           this.longitudine = longitudine;
    }


    /**
     * Gets the idcategoria value for this Annuncioppins.
     * 
     * @return idcategoria
     */
    public int getIdcategoria() {
        return idcategoria;
    }


    /**
     * Sets the idcategoria value for this Annuncioppins.
     * 
     * @param idcategoria
     */
    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }


    /**
     * Gets the titolo value for this Annuncioppins.
     * 
     * @return titolo
     */
    public java.lang.String getTitolo() {
        return titolo;
    }


    /**
     * Sets the titolo value for this Annuncioppins.
     * 
     * @param titolo
     */
    public void setTitolo(java.lang.String titolo) {
        this.titolo = titolo;
    }


    /**
     * Gets the descrizioneLunga value for this Annuncioppins.
     * 
     * @return descrizioneLunga
     */
    public java.lang.String getDescrizioneLunga() {
        return descrizioneLunga;
    }


    /**
     * Sets the descrizioneLunga value for this Annuncioppins.
     * 
     * @param descrizioneLunga
     */
    public void setDescrizioneLunga(java.lang.String descrizioneLunga) {
        this.descrizioneLunga = descrizioneLunga;
    }


    /**
     * Gets the prezzo value for this Annuncioppins.
     * 
     * @return prezzo
     */
    public java.lang.Integer getPrezzo() {
        return prezzo;
    }


    /**
     * Sets the prezzo value for this Annuncioppins.
     * 
     * @param prezzo
     */
    public void setPrezzo(java.lang.Integer prezzo) {
        this.prezzo = prezzo;
    }


    /**
     * Gets the telefono value for this Annuncioppins.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this Annuncioppins.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }


    /**
     * Gets the cellulare value for this Annuncioppins.
     * 
     * @return cellulare
     */
    public java.lang.String getCellulare() {
        return cellulare;
    }


    /**
     * Sets the cellulare value for this Annuncioppins.
     * 
     * @param cellulare
     */
    public void setCellulare(java.lang.String cellulare) {
        this.cellulare = cellulare;
    }


    /**
     * Gets the caratteristiche value for this Annuncioppins.
     * 
     * @return caratteristiche
     */
    public java.lang.String getCaratteristiche() {
        return caratteristiche;
    }


    /**
     * Sets the caratteristiche value for this Annuncioppins.
     * 
     * @param caratteristiche
     */
    public void setCaratteristiche(java.lang.String caratteristiche) {
        this.caratteristiche = caratteristiche;
    }


    /**
     * Gets the pubblicaemail value for this Annuncioppins.
     * 
     * @return pubblicaemail
     */
    public java.lang.Boolean getPubblicaemail() {
        return pubblicaemail;
    }


    /**
     * Sets the pubblicaemail value for this Annuncioppins.
     * 
     * @param pubblicaemail
     */
    public void setPubblicaemail(java.lang.Boolean pubblicaemail) {
        this.pubblicaemail = pubblicaemail;
    }


    /**
     * Gets the latitudine value for this Annuncioppins.
     * 
     * @return latitudine
     */
    public java.lang.Double getLatitudine() {
        return latitudine;
    }


    /**
     * Sets the latitudine value for this Annuncioppins.
     * 
     * @param latitudine
     */
    public void setLatitudine(java.lang.Double latitudine) {
        this.latitudine = latitudine;
    }


    /**
     * Gets the longitudine value for this Annuncioppins.
     * 
     * @return longitudine
     */
    public java.lang.Double getLongitudine() {
        return longitudine;
    }


    /**
     * Sets the longitudine value for this Annuncioppins.
     * 
     * @param longitudine
     */
    public void setLongitudine(java.lang.Double longitudine) {
        this.longitudine = longitudine;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Annuncioppins)) return false;
        Annuncioppins other = (Annuncioppins) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idcategoria == other.getIdcategoria() &&
            ((this.titolo==null && other.getTitolo()==null) || 
             (this.titolo!=null &&
              this.titolo.equals(other.getTitolo()))) &&
            ((this.descrizioneLunga==null && other.getDescrizioneLunga()==null) || 
             (this.descrizioneLunga!=null &&
              this.descrizioneLunga.equals(other.getDescrizioneLunga()))) &&
            ((this.prezzo==null && other.getPrezzo()==null) || 
             (this.prezzo!=null &&
              this.prezzo.equals(other.getPrezzo()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono()))) &&
            ((this.cellulare==null && other.getCellulare()==null) || 
             (this.cellulare!=null &&
              this.cellulare.equals(other.getCellulare()))) &&
            ((this.caratteristiche==null && other.getCaratteristiche()==null) || 
             (this.caratteristiche!=null &&
              this.caratteristiche.equals(other.getCaratteristiche()))) &&
            ((this.pubblicaemail==null && other.getPubblicaemail()==null) || 
             (this.pubblicaemail!=null &&
              this.pubblicaemail.equals(other.getPubblicaemail()))) &&
            ((this.latitudine==null && other.getLatitudine()==null) || 
             (this.latitudine!=null &&
              this.latitudine.equals(other.getLatitudine()))) &&
            ((this.longitudine==null && other.getLongitudine()==null) || 
             (this.longitudine!=null &&
              this.longitudine.equals(other.getLongitudine())));
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
        _hashCode += getIdcategoria();
        if (getTitolo() != null) {
            _hashCode += getTitolo().hashCode();
        }
        if (getDescrizioneLunga() != null) {
            _hashCode += getDescrizioneLunga().hashCode();
        }
        if (getPrezzo() != null) {
            _hashCode += getPrezzo().hashCode();
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        if (getCellulare() != null) {
            _hashCode += getCellulare().hashCode();
        }
        if (getCaratteristiche() != null) {
            _hashCode += getCaratteristiche().hashCode();
        }
        if (getPubblicaemail() != null) {
            _hashCode += getPubblicaemail().hashCode();
        }
        if (getLatitudine() != null) {
            _hashCode += getLatitudine().hashCode();
        }
        if (getLongitudine() != null) {
            _hashCode += getLongitudine().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Annuncioppins.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "annuncioppins"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idcategoria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "idcategoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titolo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "titolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneLunga");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "descrizioneLunga"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prezzo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "prezzo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "telefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellulare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "cellulare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caratteristiche");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "caratteristiche"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubblicaemail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "pubblicaemail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitudine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "latitudine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitudine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datasynaptic.com/portaportese/", "longitudine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
