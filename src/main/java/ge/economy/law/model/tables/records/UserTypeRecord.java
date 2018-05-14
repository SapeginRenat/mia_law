/**
 * This class is generated by jOOQ
 */
package ge.economy.law.model.tables.records;


import ge.economy.law.model.tables.UserType;
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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class UserTypeRecord extends UpdatableRecordImpl<UserTypeRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1922992502;

    /**
     * Setter for <code>public.user_type.type_id</code>.
     */
    public void setTypeId(Integer value) {
        setValue(0, value);
    }

    /**
     * Getter for <code>public.user_type.type_id</code>.
     */
    public Integer getTypeId() {
        return (Integer) getValue(0);
    }

    /**
     * Setter for <code>public.user_type.name</code>.
     */
    public void setName(String value) {
        setValue(1, value);
    }

    /**
     * Getter for <code>public.user_type.name</code>.
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
        return UserType.USER_TYPE.TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UserType.USER_TYPE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTypeId();
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
    public UserTypeRecord value1(Integer value) {
        setTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserTypeRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserTypeRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserTypeRecord
     */
    public UserTypeRecord() {
        super(UserType.USER_TYPE);
    }

    /**
     * Create a detached, initialised UserTypeRecord
     */
    public UserTypeRecord(Integer typeId, String name) {
        super(UserType.USER_TYPE);

        setValue(0, typeId);
        setValue(1, name);
    }
}
