/*
 * An XML document type.
 * Localname: FieldNotFound
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esearch
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esearch.FieldNotFoundDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esearch.impl;
/**
 * A document containing one FieldNotFound(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch) element.
 *
 * This is a complex type.
 */
public class FieldNotFoundDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esearch.FieldNotFoundDocument
{
    
    public FieldNotFoundDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELDNOTFOUND$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "FieldNotFound");
    
    
    /**
     * Gets the "FieldNotFound" element
     */
    public java.lang.String getFieldNotFound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDNOTFOUND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FieldNotFound" element
     */
    public org.apache.xmlbeans.XmlString xgetFieldNotFound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDNOTFOUND$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FieldNotFound" element
     */
    public void setFieldNotFound(java.lang.String fieldNotFound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDNOTFOUND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIELDNOTFOUND$0);
            }
            target.setStringValue(fieldNotFound);
        }
    }
    
    /**
     * Sets (as xml) the "FieldNotFound" element
     */
    public void xsetFieldNotFound(org.apache.xmlbeans.XmlString fieldNotFound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDNOTFOUND$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIELDNOTFOUND$0);
            }
            target.set(fieldNotFound);
        }
    }
}
