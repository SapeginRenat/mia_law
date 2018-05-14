/**
 * This class is generated by jOOQ
 */
package ge.economy.law.model.tables.records;


import ge.economy.law.model.tables.CaseDoc;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.7.3"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class CaseDocRecord extends UpdatableRecordImpl<CaseDocRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = 1933684532;

    /**
     * Setter for <code>public.case_doc.doc_id</code>.
     */
    public void setDocId(Integer value) {
        setValue(0, value);
    }

    /**
     * Getter for <code>public.case_doc.doc_id</code>.
     */
    public Integer getDocId() {
        return (Integer) getValue(0);
    }

    /**
     * Setter for <code>public.case_doc.case_id</code>.
     */
    public void setCaseId(Integer value) {
        setValue(1, value);
    }

    /**
     * Getter for <code>public.case_doc.case_id</code>.
     */
    public Integer getCaseId() {
        return (Integer) getValue(1);
    }

    /**
     * Setter for <code>public.case_doc.name</code>.
     */
    public void setName(String value) {
        setValue(2, value);
    }

    /**
     * Getter for <code>public.case_doc.name</code>.
     */
    public String getName() {
        return (String) getValue(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CaseDoc.CASE_DOC.DOC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CaseDoc.CASE_DOC.CASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CaseDoc.CASE_DOC.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDocId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CaseDocRecord value1(Integer value) {
        setDocId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CaseDocRecord value2(Integer value) {
        setCaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CaseDocRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CaseDocRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CaseDocRecord
     */
    public CaseDocRecord() {
        super(CaseDoc.CASE_DOC);
    }

    /**
     * Create a detached, initialised CaseDocRecord
     */
    public CaseDocRecord(Integer docId, Integer caseId, String name) {
        super(CaseDoc.CASE_DOC);

        setValue(0, docId);
        setValue(1, caseId);
        setValue(2, name);
    }
}
