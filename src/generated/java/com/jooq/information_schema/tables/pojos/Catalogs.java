/*
 * This file is generated by jOOQ.
*/
package com.jooq.information_schema.tables.pojos;


import com.jooq.information_schema.tables.interfaces.ICatalogs;

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
public class Catalogs implements ICatalogs {

    private static final long serialVersionUID = 95130036;

    private String catalogName;

    public Catalogs() {}

    public Catalogs(Catalogs value) {
        this.catalogName = value.catalogName;
    }

    public Catalogs(
        String catalogName
    ) {
        this.catalogName = catalogName;
    }

    @Override
    public String getCatalogName() {
        return this.catalogName;
    }

    @Override
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Catalogs (");

        sb.append(catalogName);

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
    public void from(ICatalogs from) {
        setCatalogName(from.getCatalogName());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ICatalogs> E into(E into) {
        into.from(this);
        return into;
    }
}