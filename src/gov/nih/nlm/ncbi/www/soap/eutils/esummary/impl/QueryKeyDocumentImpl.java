/*
 * An XML document type.
 * Localname: query_key
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esummary
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esummary.QueryKeyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esummary.impl;
/**
 * A document containing one query_key(@http://www.ncbi.nlm.nih.gov/soap/eutils/esummary) element.
 *
 * This is a complex type.
 */
public class QueryKeyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esummary.QueryKeyDocument
{
    
    public QueryKeyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYKEY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "query_key");
    
    
    /**
     * Gets the "query_key" element
     */
    public java.lang.String getQueryKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "query_key" element
     */
    public org.apache.xmlbeans.XmlString xgetQueryKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYKEY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "query_key" element
     */
    public void setQueryKey(java.lang.String queryKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYKEY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYKEY$0);
            }
            target.setStringValue(queryKey);
        }
    }
    
    /**
     * Sets (as xml) the "query_key" element
     */
    public void xsetQueryKey(org.apache.xmlbeans.XmlString queryKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYKEY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERYKEY$0);
            }
            target.set(queryKey);
        }
    }
}
