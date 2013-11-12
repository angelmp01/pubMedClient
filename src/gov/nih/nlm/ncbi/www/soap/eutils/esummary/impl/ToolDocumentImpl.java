/*
 * An XML document type.
 * Localname: tool
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/esummary
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.esummary.ToolDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.esummary.impl;
/**
 * A document containing one tool(@http://www.ncbi.nlm.nih.gov/soap/eutils/esummary) element.
 *
 * This is a complex type.
 */
public class ToolDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.esummary.ToolDocument
{
    
    public ToolDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOOL$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "tool");
    
    
    /**
     * Gets the "tool" element
     */
    public java.lang.String getTool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tool" element
     */
    public org.apache.xmlbeans.XmlString xgetTool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOOL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tool" element
     */
    public void setTool(java.lang.String tool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOOL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOOL$0);
            }
            target.setStringValue(tool);
        }
    }
    
    /**
     * Sets (as xml) the "tool" element
     */
    public void xsetTool(org.apache.xmlbeans.XmlString tool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOOL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOOL$0);
            }
            target.set(tool);
        }
    }
}
