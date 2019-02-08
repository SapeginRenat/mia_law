/**
 * This class is generated by jOOQ
 */
package ge.economy.law.model.tables.records;


import ge.economy.law.model.tables.LitigationSubject;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LitigationSubjectRecord extends UpdatableRecordImpl<LitigationSubjectRecord> implements Record2<Integer, String> {

	private static final long serialVersionUID = 1233517683;

	/**
	 * Setter for <code>public.litigation_subject.litigation_subject_id</code>.
	 */
	public void setLitigationSubjectId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.litigation_subject.litigation_subject_id</code>.
	 */
	public Integer getLitigationSubjectId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.litigation_subject.name</code>.
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.litigation_subject.name</code>.
	 */
	public String getName() {
		return (String) getValue(1);
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
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return LitigationSubject.LITIGATION_SUBJECT.LITIGATION_SUBJECT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return LitigationSubject.LITIGATION_SUBJECT.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getLitigationSubjectId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LitigationSubjectRecord value1(Integer value) {
		setLitigationSubjectId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LitigationSubjectRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LitigationSubjectRecord values(Integer value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached LitigationSubjectRecord
	 */
	public LitigationSubjectRecord() {
		super(LitigationSubject.LITIGATION_SUBJECT);
	}

	/**
	 * Create a detached, initialised LitigationSubjectRecord
	 */
	public LitigationSubjectRecord(Integer litigationSubjectId, String name) {
		super(LitigationSubject.LITIGATION_SUBJECT);

		setValue(0, litigationSubjectId);
		setValue(1, name);
	}
}
