/*
 * An XML document type.
 * Localname: eSpellResult
 * Namespace: http://www.ncbi.nlm.nih.gov/soap/eutils/espell
 * Java type: gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResultDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.soap.eutils.espell.impl;
/**
 * A document containing one eSpellResult(@http://www.ncbi.nlm.nih.gov/soap/eutils/espell) element.
 *
 * This is a complex type.
 */
public class ESpellResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResultDocument
{
    
    public ESpellResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESPELLRESULT$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "eSpellResult");
    
    
    /**
     * Gets the "eSpellResult" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResultDocument.ESpellResult getESpellResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResultDocument.ESpellResult target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResultDocument.ESpellResult)get_store().find_element_user(ESPELLRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eSpellResult" element
     */
    public void setESpellResult(gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResultDocument.ESpellResult eSpellResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResultDocument.ESpellResult target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResultDocument.ESpellResult)get_store().find_element_user(ESPELLRESULT$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResultDocument.ESpellResult)get_store().add_element_user(ESPELLRESULT$0);
            }
            target.set(eSpellResult);
        }
    }
    
    /**
     * Appends and returns a new empty "eSpellResult" element
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResultDocument.ESpellResult addNewESpellResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResultDocument.ESpellResult target = null;
            target = (gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResultDocument.ESpellResult)get_store().add_element_user(ESPELLRESULT$0);
            return target;
        }
    }
    /**
     * An XML eSpellResult(@http://www.ncbi.nlm.nih.gov/soap/eutils/espell).
     *
     * This is a complex type.
     */
    public static class ESpellResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResultDocument.ESpellResult
    {
        
        public ESpellResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATABASE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "Database");
        private static final javax.xml.namespace.QName QUERY$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "Query");
        private static final javax.xml.namespace.QName CORRECTEDQUERY$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "CorrectedQuery");
        private static final javax.xml.namespace.QName SPELLEDQUERY$6 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "SpelledQuery");
        private static final javax.xml.namespace.QName ERROR$8 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/espell", "ERROR");
        
        
        /**
         * Gets the "Database" element
         */
        public java.lang.String getDatabase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATABASE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Database" element
         */
        public org.apache.xmlbeans.XmlString xgetDatabase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATABASE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Database" element
         */
        public void setDatabase(java.lang.String database)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATABASE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATABASE$0);
                }
                target.setStringValue(database);
            }
        }
        
        /**
         * Sets (as xml) the "Database" element
         */
        public void xsetDatabase(org.apache.xmlbeans.XmlString database)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATABASE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATABASE$0);
                }
                target.set(database);
            }
        }
        
        /**
         * Gets the "Query" element
         */
        public java.lang.String getQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERY$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERY$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERY$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERY$2);
                }
                target.set(query);
            }
        }
        
        /**
         * Gets the "CorrectedQuery" element
         */
        public java.lang.String getCorrectedQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRECTEDQUERY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CorrectedQuery" element
         */
        public org.apache.xmlbeans.XmlString xgetCorrectedQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORRECTEDQUERY$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CorrectedQuery" element
         */
        public void setCorrectedQuery(java.lang.String correctedQuery)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRECTEDQUERY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORRECTEDQUERY$4);
                }
                target.setStringValue(correctedQuery);
            }
        }
        
        /**
         * Sets (as xml) the "CorrectedQuery" element
         */
        public void xsetCorrectedQuery(org.apache.xmlbeans.XmlString correctedQuery)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORRECTEDQUERY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORRECTEDQUERY$4);
                }
                target.set(correctedQuery);
            }
        }
        
        /**
         * Gets the "SpelledQuery" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery getSpelledQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery)get_store().find_element_user(SPELLEDQUERY$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "SpelledQuery" element
         */
        public void setSpelledQuery(gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery spelledQuery)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery)get_store().find_element_user(SPELLEDQUERY$6, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery)get_store().add_element_user(SPELLEDQUERY$6);
                }
                target.set(spelledQuery);
            }
        }
        
        /**
         * Appends and returns a new empty "SpelledQuery" element
         */
        public gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery addNewSpelledQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery target = null;
                target = (gov.nih.nlm.ncbi.www.soap.eutils.espell.SpelledQueryDocument.SpelledQuery)get_store().add_element_user(SPELLEDQUERY$6);
                return target;
            }
        }
        
        /**
         * Gets the "ERROR" element
         */
        public java.lang.String getERROR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ERROR" element
         */
        public org.apache.xmlbeans.XmlString xgetERROR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ERROR" element
         */
        public void setERROR(java.lang.String error)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERROR$8);
                }
                target.setStringValue(error);
            }
        }
        
        /**
         * Sets (as xml) the "ERROR" element
         */
        public void xsetERROR(org.apache.xmlbeans.XmlString error)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERROR$8);
                }
                target.set(error);
            }
        }
    }
}
