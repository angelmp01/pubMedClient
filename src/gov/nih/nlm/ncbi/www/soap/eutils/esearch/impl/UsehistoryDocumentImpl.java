/*
 * An XML document type.
 * Localname: usehistory
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esearch
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esearch.UsehistoryDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esearch.impl;
/**
 * A document containing one usehistory(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch) element.
 *
 * This is a complex type.
 */
public class UsehistoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esearch.UsehistoryDocument
{
    
    public UsehistoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USEHISTORY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "usehistory");
    
    
    /**
     * Gets the "usehistory" element
     */
    public java.lang.String getUsehistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEHISTORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "usehistory" element
     */
    public org.apache.xmlbeans.XmlString xgetUsehistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEHISTORY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "usehistory" element
     */
    public void setUsehistory(java.lang.String usehistory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEHISTORY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USEHISTORY$0);
            }
            target.setStringValue(usehistory);
        }
    }
    
    /**
     * Sets (as xml) the "usehistory" element
     */
    public void xsetUsehistory(org.apache.xmlbeans.XmlString usehistory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEHISTORY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USEHISTORY$0);
            }
            target.set(usehistory);
        }
    }
}
