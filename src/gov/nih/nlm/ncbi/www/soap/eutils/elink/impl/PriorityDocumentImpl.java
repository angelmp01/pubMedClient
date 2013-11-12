/*
 * An XML document type.
 * Localname: Priority
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.PriorityDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * A document containing one Priority(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink) element.
 *
 * This is a complex type.
 */
public class PriorityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.PriorityDocument
{
    
    public PriorityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIORITY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "Priority");
    
    
    /**
     * Gets the "Priority" element
     */
    public java.lang.String getPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Priority" element
     */
    public org.apache.xmlbeans.XmlString xgetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIORITY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Priority" element
     */
    public void setPriority(java.lang.String priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIORITY$0);
            }
            target.setStringValue(priority);
        }
    }
    
    /**
     * Sets (as xml) the "Priority" element
     */
    public void xsetPriority(org.apache.xmlbeans.XmlString priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIORITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIORITY$0);
            }
            target.set(priority);
        }
    }
}
