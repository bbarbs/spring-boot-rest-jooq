/*
 * This file is generated by jOOQ.
*/
package com.jooq.information_schema.tables.interfaces;


import java.io.Serializable;

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
public interface ISettings extends Serializable {

    /**
     * Setter for <code>INFORMATION_SCHEMA.SETTINGS.NAME</code>.
     */
    public void setName(String value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.SETTINGS.NAME</code>.
     */
    public String getName();

    /**
     * Setter for <code>INFORMATION_SCHEMA.SETTINGS.VALUE</code>.
     */
    public void setValue(String value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.SETTINGS.VALUE</code>.
     */
    public String getValue();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISettings
     */
    public void from(com.jooq.information_schema.tables.interfaces.ISettings from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISettings
     */
    public <E extends com.jooq.information_schema.tables.interfaces.ISettings> E into(E into);
}