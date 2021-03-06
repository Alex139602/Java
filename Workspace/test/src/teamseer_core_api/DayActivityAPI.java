/**
 * DayActivityAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package teamseer_core_api;

@SuppressWarnings("serial")
public class DayActivityAPI  implements java.io.Serializable {
    private java.lang.String categoryArr;

    private java.lang.String date;

    private boolean hasNotes;

    private boolean needsApproval;

    private java.lang.String statusStr;

    private java.lang.String typeStr;

    private java.lang.String userIdentifier;

    public DayActivityAPI() {
    }

    public DayActivityAPI(
           java.lang.String categoryArr,
           java.lang.String date,
           boolean hasNotes,
           boolean needsApproval,
           java.lang.String statusStr,
           java.lang.String typeStr,
           java.lang.String userIdentifier) {
           this.categoryArr = categoryArr;
           this.date = date;
           this.hasNotes = hasNotes;
           this.needsApproval = needsApproval;
           this.statusStr = statusStr;
           this.typeStr = typeStr;
           this.userIdentifier = userIdentifier;
    }


    /**
     * Gets the categoryArr value for this DayActivityAPI.
     * 
     * @return categoryArr
     */
    public java.lang.String getCategoryArr() {
        return categoryArr;
    }


    /**
     * Sets the categoryArr value for this DayActivityAPI.
     * 
     * @param categoryArr
     */
    public void setCategoryArr(java.lang.String categoryArr) {
        this.categoryArr = categoryArr;
    }


    /**
     * Gets the date value for this DayActivityAPI.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this DayActivityAPI.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the hasNotes value for this DayActivityAPI.
     * 
     * @return hasNotes
     */
    public boolean isHasNotes() {
        return hasNotes;
    }


    /**
     * Sets the hasNotes value for this DayActivityAPI.
     * 
     * @param hasNotes
     */
    public void setHasNotes(boolean hasNotes) {
        this.hasNotes = hasNotes;
    }


    /**
     * Gets the needsApproval value for this DayActivityAPI.
     * 
     * @return needsApproval
     */
    public boolean isNeedsApproval() {
        return needsApproval;
    }


    /**
     * Sets the needsApproval value for this DayActivityAPI.
     * 
     * @param needsApproval
     */
    public void setNeedsApproval(boolean needsApproval) {
        this.needsApproval = needsApproval;
    }


    /**
     * Gets the statusStr value for this DayActivityAPI.
     * 
     * @return statusStr
     */
    public java.lang.String getStatusStr() {
        return statusStr;
    }


    /**
     * Sets the statusStr value for this DayActivityAPI.
     * 
     * @param statusStr
     */
    public void setStatusStr(java.lang.String statusStr) {
        this.statusStr = statusStr;
    }


    /**
     * Gets the typeStr value for this DayActivityAPI.
     * 
     * @return typeStr
     */
    public java.lang.String getTypeStr() {
        return typeStr;
    }


    /**
     * Sets the typeStr value for this DayActivityAPI.
     * 
     * @param typeStr
     */
    public void setTypeStr(java.lang.String typeStr) {
        this.typeStr = typeStr;
    }


    /**
     * Gets the userIdentifier value for this DayActivityAPI.
     * 
     * @return userIdentifier
     */
    public java.lang.String getUserIdentifier() {
        return userIdentifier;
    }


    /**
     * Sets the userIdentifier value for this DayActivityAPI.
     * 
     * @param userIdentifier
     */
    public void setUserIdentifier(java.lang.String userIdentifier) {
        this.userIdentifier = userIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DayActivityAPI)) return false;
        DayActivityAPI other = (DayActivityAPI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.categoryArr==null && other.getCategoryArr()==null) || 
             (this.categoryArr!=null &&
              this.categoryArr.equals(other.getCategoryArr()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            this.hasNotes == other.isHasNotes() &&
            this.needsApproval == other.isNeedsApproval() &&
            ((this.statusStr==null && other.getStatusStr()==null) || 
             (this.statusStr!=null &&
              this.statusStr.equals(other.getStatusStr()))) &&
            ((this.typeStr==null && other.getTypeStr()==null) || 
             (this.typeStr!=null &&
              this.typeStr.equals(other.getTypeStr()))) &&
            ((this.userIdentifier==null && other.getUserIdentifier()==null) || 
             (this.userIdentifier!=null &&
              this.userIdentifier.equals(other.getUserIdentifier())));
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
        if (getCategoryArr() != null) {
            _hashCode += getCategoryArr().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        _hashCode += (isHasNotes() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNeedsApproval() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStatusStr() != null) {
            _hashCode += getStatusStr().hashCode();
        }
        if (getTypeStr() != null) {
            _hashCode += getTypeStr().hashCode();
        }
        if (getUserIdentifier() != null) {
            _hashCode += getUserIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DayActivityAPI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:teamseer_core_api", "DayActivityAPI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryArr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryArr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needsApproval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "needsApproval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusStr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeStr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typeStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userIdentifier"));
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
    
    public String toString(){
    	return String.format("%s %s %s", this.getUserIdentifier(), this.getStatusStr(), this.getDate());
    }

}
