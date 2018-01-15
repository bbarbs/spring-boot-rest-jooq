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
public interface IHelp extends Serializable {

    /**
     * Setter for <code>INFORMATION_SCHEMA.HELP.ID</code>.
     */
    public void setId(Integer value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.HELP.ID</code>.
     */
    public Integer getId();

    /**
     * Setter for <code>INFORMATION_SCHEMA.HELP.SECTION</code>.
     */
    public void setSection(String value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.HELP.SECTION</code>.
     */
    public String getSection();

    /**
     * Setter for <code>INFORMATION_SCHEMA.HELP.TOPIC</code>.
     */
    public void setTopic(String value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.HELP.TOPIC</code>.
     */
    public String getTopic();

    /**
     * Setter for <code>INFORMATION_SCHEMA.HELP.SYNTAX</code>.
     */
    public void setSyntax(String value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.HELP.SYNTAX</code>.
     */
    public String getSyntax();

    /**
     * Setter for <code>INFORMATION_SCHEMA.HELP.TEXT</code>.
     */
    public void setText(String value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.HELP.TEXT</code>.
     */
    public String getText();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IHelp
     */
    public void from(com.jooq.information_schema.tables.interfaces.IHelp from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IHelp
     */
    public <E extends com.jooq.information_schema.tables.interfaces.IHelp> E into(E into);
}