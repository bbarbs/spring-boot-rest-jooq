/*
 * This file is generated by jOOQ.
*/
package com.jooq.information_schema.tables.pojos;


import com.jooq.information_schema.tables.interfaces.ITableTypes;

import javax.annotation.Generated;


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
public class TableTypes implements ITableTypes {

    private static final long serialVersionUID = -859445392;

    private String type;

    public TableTypes() {}

    public TableTypes(TableTypes value) {
        this.type = value.type;
    }

    public TableTypes(
        String type
    ) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TableTypes (");

        sb.append(type);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ITableTypes from) {
        setType(from.getType());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITableTypes> E into(E into) {
        into.from(this);
        return into;
    }
}