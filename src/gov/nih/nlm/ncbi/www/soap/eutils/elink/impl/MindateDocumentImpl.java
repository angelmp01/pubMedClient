/*
 * An XML document type.
 * Localname: mindate
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.MindateDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * A document containing one mindate(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink) element.
 *
 * This is a complex type.
 */
public class MindateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.MindateDocument
{
    
    public MindateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINDATE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "mindate");
    
    
    /**
     * Gets the "mindate" element
     */
    public java.lang.String getMindate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mindate" element
     */
    public org.apache.xmlbeans.XmlString xgetMindate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mindate" element
     */
    public void setMindate(java.lang.String mindate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINDATE$0);
            }
            target.setStringValue(mindate);
        }
    }
    
    /**
     * Sets (as xml) the "mindate" element
     */
    public void xsetMindate(org.apache.xmlbeans.XmlString mindate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MINDATE$0);
            }
            target.set(mindate);
        }
    }
}
