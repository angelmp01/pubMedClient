/*
 * An XML document type.
 * Localname: Explode
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esearch
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esearch.ExplodeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esearch.impl;
/**
 * A document containing one Explode(@http://www.ncbi.nlm.nih.gov/soap/eutils/esearch) element.
 *
 * This is a complex type.
 */
public class ExplodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esearch.ExplodeDocument
{
    
    public ExplodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPLODE$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "Explode");
    
    
    /**
     * Gets the "Explode" element
     */
    public java.lang.String getExplode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPLODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Explode" element
     */
    public org.apache.xmlbeans.XmlString xgetExplode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPLODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Explode" element
     */
    public void setExplode(java.lang.String explode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPLODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPLODE$0);
            }
            target.setStringValue(explode);
        }
    }
    
    /**
     * Sets (as xml) the "Explode" element
     */
    public void xsetExplode(org.apache.xmlbeans.XmlString explode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPLODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPLODE$0);
            }
            target.set(explode);
        }
    }
}
