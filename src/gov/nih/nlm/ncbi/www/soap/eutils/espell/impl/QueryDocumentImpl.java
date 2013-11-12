/*
 * An XML document type.
 * Localname: Query
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/espell
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.espell.QueryDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.espell.impl;
/**
 * A document containing one Query(@http://www.ncbi.nlm.nih.gov/soap/eutils/espell) element.
 *
 * This is a complex type.
 */
public class QueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.espell.QueryDocument
{
    
    public QueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "Query");
    
    
    /**
     * Gets the "Query" element
     */
    public java.lang.String getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Query" element
     */
    public org.apache.xmlbeans.XmlString xgetQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Query" element
     */
    public void setQuery(java.lang.String query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERY$0);
            }
            target.setStringValue(query);
        }
    }
    
    /**
     * Sets (as xml) the "Query" element
     */
    public void xsetQuery(org.apache.xmlbeans.XmlString query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERY$0);
            }
            target.set(query);
        }
    }
}
