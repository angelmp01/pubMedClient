/*
 * An XML document type.
 * Localname: id
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/elink
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.elink.IdDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.elink.impl;
/**
 * A document containing one id(@http://www.ncbi.nlm.nih.gov/soap/eutils/elink) element.
 *
 * This is a complex type.
 */
public class IdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.elink.IdDocument
{
    
    public IdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/elink", "id");
    
    
    /**
     * Gets the "id" element
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
}
