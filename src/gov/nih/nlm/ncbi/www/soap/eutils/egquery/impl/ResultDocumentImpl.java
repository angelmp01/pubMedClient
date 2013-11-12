/*
 * An XML document type.
 * Localname: Result
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/egquery
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.egquery.impl;
/**
 * A document containing one Result(@http://www.ncbi.nlm.nih.gov/soap/eutils/egquery) element.
 *
 * This is a complex type.
 */
public class ResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument
{
    
    public ResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESULT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/egquery", "Result");
    
    
    /**
     * Gets the "Result" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument.Result getResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument.Result target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument.Result)get_store().find_element_user(RESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Result" element
     */
    public void setResult(gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument.Result result)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument.Result target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument.Result)get_store().find_element_user(RESULT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument.Result)get_store().add_element_user(RESULT$0);
            }
            target.set(result);
        }
    }
    
    /**
     * Appends and returns a new empty "Result" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument.Result addNewResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument.Result target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument.Result)get_store().add_element_user(RESULT$0);
            return target;
        }
    }
    /**
     * An XML Result(@http://www.ncbi.nlm.nih.gov/soap/eutils/egquery).
     *
     * This is a complex type.
     */
    public static class ResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultDocument.Result
    {
        
        public ResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TERM$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/egquery", "Term");
        private static final javax.xml.namespace.QName EGQUERYRESULT$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/egquery", "eGQueryResult");
        
        
        /**
         * Gets the "Term" element
         */
        public java.lang.String getTerm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERM$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Term" element
         */
        public org.apache.xmlbeans.XmlString xgetTerm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TERM$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Term" element
         */
        public void setTerm(java.lang.String term)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TERM$0);
                }
                target.setStringValue(term);
            }
        }
        
        /**
         * Sets (as xml) the "Term" element
         */
        public void xsetTerm(org.apache.xmlbeans.XmlString term)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TERM$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TERM$0);
                }
                target.set(term);
            }
        }
        
        /**
         * Gets the "eGQueryResult" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGQueryResultType getEGQueryResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGQueryResultType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGQueryResultType)get_store().find_element_user(EGQUERYRESULT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "eGQueryResult" element
         */
        public void setEGQueryResult(gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGQueryResultType egQueryResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGQueryResultType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGQueryResultType)get_store().find_element_user(EGQUERYRESULT$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGQueryResultType)get_store().add_element_user(EGQUERYRESULT$2);
                }
                target.set(egQueryResult);
            }
        }
        
        /**
         * Appends and returns a new empty "eGQueryResult" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGQueryResultType addNewEGQueryResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGQueryResultType target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGQueryResultType)get_store().add_element_user(EGQUERYRESULT$2);
                return target;
            }
        }
    }
}
