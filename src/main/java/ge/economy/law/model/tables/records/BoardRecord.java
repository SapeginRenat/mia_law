/**
 * This class is generated by jOOQ
 */
package ge.economy.law.model.tables.records;

import ge.economy.law.model.tables.Board;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * კოლეგია
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BoardRecord extends UpdatableRecordImpl<BoardRecord> implements Record2<Integer, String> {

	private static final long serialVersionUID = 1499639137;

	/**
	 * Setter for <code>public.board.board_id</code>.
	 */
	public void setBoardId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.board.board_id</code>.
	 */
	public Integer getBoardId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.board.name</code>.
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.board.name</code>.
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
		return Board.BOARD.BOARD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Board.BOARD.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getBoardId();
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
	public BoardRecord value1(Integer value) {
		setBoardId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BoardRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BoardRecord values(Integer value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BoardRecord
	 */
	public BoardRecord() {
		super(Board.BOARD);
	}

	/**
	 * Create a detached, initialised BoardRecord
	 */
	public BoardRecord(Integer boardId, String name) {
		super(Board.BOARD);

		setValue(0, boardId);
		setValue(1, name);
	}
}
