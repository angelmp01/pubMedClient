/*
 * An XML document type.
 * Localname: RetMax
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esearch
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esearch.RetMaxDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esearch.impl;
/**
 * A document containing one RetMax(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch) element.
 *
 * This is a complex type.
 */
public class RetMaxDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esearch.RetMaxDocument
{
    
    public RetMaxDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETMAX$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "RetMax");
    
    
    /**
     * Gets the "RetMax" element
     */
    public java.lang.String getRetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETMAX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RetMax" element
     */
    public org.apache.xmlbeans.XmlString xgetRetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETMAX$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RetMax" element
     */
    public void setRetMax(java.lang.String retMax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETMAX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETMAX$0);
            }
            target.setStringValue(retMax);
        }
    }
    
    /**
     * Sets (as xml) the "RetMax" element
     */
    public void xsetRetMax(org.apache.xmlbeans.XmlString retMax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETMAX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETMAX$0);
            }
            target.set(retMax);
        }
    }
}
