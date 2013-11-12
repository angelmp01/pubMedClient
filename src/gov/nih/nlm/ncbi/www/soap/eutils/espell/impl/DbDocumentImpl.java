/*
 * An XML document type.
 * Localname: db
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/espell
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.espell.DbDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.espell.impl;
/**
 * A document containing one db(@http://www.ncbi.nlm.nih.gov/soap/eutils/espell) element.
 *
 * This is a complex type.
 */
public class DbDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.espell.DbDocument
{
    
    public DbDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DB$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "db");
    
    
    /**
     * Gets the "db" element
     */
    public java.lang.String getDb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DB$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "db" element
     */
    public org.apache.xmlbeans.XmlString xgetDb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DB$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "db" element
     */
    public void setDb(java.lang.String db)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DB$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DB$0);
            }
            target.setStringValue(db);
        }
    }
    
    /**
     * Sets (as xml) the "db" element
     */
    public void xsetDb(org.apache.xmlbeans.XmlString db)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DB$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DB$0);
            }
            target.set(db);
        }
    }
}
