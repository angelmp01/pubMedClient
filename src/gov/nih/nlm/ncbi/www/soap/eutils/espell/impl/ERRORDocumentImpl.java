/*
 * An XML document type.
 * Localname: ERROR
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/espell
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.espell.ERRORDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.espell.impl;
/**
 * A document containing one ERROR(@http://www.ncbi.nlm.nih.gov/soap/eutils/espell) element.
 *
 * This is a complex type.
 */
public class ERRORDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.espell.ERRORDocument
{
    
    public ERRORDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROR$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "ERROR");
    
    
    /**
     * Gets the "ERROR" element
     */
    public java.lang.String getERROR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ERROR" element
     */
    public org.apache.xmlbeans.XmlString xgetERROR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ERROR" element
     */
    public void setERROR(java.lang.String error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERROR$0);
            }
            target.setStringValue(error);
        }
    }
    
    /**
     * Sets (as xml) the "ERROR" element
     */
    public void xsetERROR(org.apache.xmlbeans.XmlString error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERROR$0);
            }
            target.set(error);
        }
    }
}
