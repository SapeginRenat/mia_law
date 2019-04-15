/**
 * This class is generated by jOOQ
 */
package ge.economy.law.model.tables.records;

import ge.economy.law.model.tables.UserStatus;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserStatusRecord extends UpdatableRecordImpl<UserStatusRecord> implements Record2<Integer, String> {

	private static final long serialVersionUID = 237009294;

	/**
	 * Setter for <code>public.user_status.status_id</code>.
	 */
	public void setStatusId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.user_status.status_id</code>.
	 */
	public Integer getStatusId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.user_status.name</code>.
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.user_status.name</code>.
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
		return UserStatus.USER_STATUS.STATUS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return UserStatus.USER_STATUS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getStatusId();
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
	public UserStatusRecord value1(Integer value) {
		setStatusId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserStatusRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserStatusRecord values(Integer value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserStatusRecord
	 */
	public UserStatusRecord() {
		super(UserStatus.USER_STATUS);
	}

	/**
	 * Create a detached, initialised UserStatusRecord
	 */
	public UserStatusRecord(Integer statusId, String name) {
		super(UserStatus.USER_STATUS);

		setValue(0, statusId);
		setValue(1, name);
	}
}
