/*
 * This file is generated by jOOQ.
*/
package com.jooq.information_schema.tables.records;


import com.jooq.information_schema.tables.SessionState;
import com.jooq.information_schema.tables.interfaces.ISessionState;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SessionStateRecord extends TableRecordImpl<SessionStateRecord> implements Record2<String, String>, ISessionState {

    private static final long serialVersionUID = -1752988394;

    /**
     * Setter for <code>INFORMATION_SCHEMA.SESSION_STATE.KEY</code>.
     */
    @Override
    public void setKey(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SESSION_STATE.KEY</code>.
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SESSION_STATE.SQL</code>.
     */
    @Override
    public void setSql(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SESSION_STATE.SQL</code>.
     */
    @Override
    public String getSql() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SessionState.SESSION_STATE.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SessionState.SESSION_STATE.SQL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSql();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSql();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionStateRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionStateRecord value2(String value) {
        setSql(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionStateRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ISessionState from) {
        setKey(from.getKey());
        setSql(from.getSql());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISessionState> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SessionStateRecord
     */
    public SessionStateRecord() {
        super(SessionState.SESSION_STATE);
    }

    /**
     * Create a detached, initialised SessionStateRecord
     */
    public SessionStateRecord(String key, String sql) {
        super(SessionState.SESSION_STATE);

        set(0, key);
        set(1, sql);
    }
}