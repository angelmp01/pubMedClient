/*
 * An XML document type.
 * Localname: NameAbbr
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.NameAbbrDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * A document containing one NameAbbr(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink) element.
 *
 * This is a complex type.
 */
public class NameAbbrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.NameAbbrDocument
{
    
    public NameAbbrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMEABBR$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "NameAbbr");
    
    
    /**
     * Gets the "NameAbbr" element
     */
    public java.lang.String getNameAbbr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMEABBR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NameAbbr" element
     */
    public org.apache.xmlbeans.XmlString xgetNameAbbr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAMEABBR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NameAbbr" element
     */
    public void setNameAbbr(java.lang.String nameAbbr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMEABBR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAMEABBR$0);
            }
            target.setStringValue(nameAbbr);
        }
    }
    
    /**
     * Sets (as xml) the "NameAbbr" element
     */
    public void xsetNameAbbr(org.apache.xmlbeans.XmlString nameAbbr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAMEABBR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAMEABBR$0);
            }
            target.set(nameAbbr);
        }
    }
}
