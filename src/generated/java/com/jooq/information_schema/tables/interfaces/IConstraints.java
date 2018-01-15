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
public interface IConstraints extends Serializable {

    /**
     * Setter for <code>INFORMATION_SCHEMA.CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public void setConstraintCatalog(String value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public String getConstraintCatalog();

    /**
     * Setter for <code>INFORMATION_SCHEMA.CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public void setConstraintSchema(String value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public String getConstraintSchema();

    /**
     * Setter for <code>INFORMATION_SCHEMA.CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public void setConstraintName(String value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public String getConstraintName();

    /**
     * Setter for <code>INFORMATION_SCHEMA.CONSTRAINTS.CONSTRAINT_TYPE</code>.
     */
    public void setConstraintType(String value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTRAINTS.CONSTRAINT_TYPE</code>.
     */
    public String getConstraintType();

    /**
     * Setter for <code>INFORMATION_SCHEMA.CONSTRAINTS.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTRAINTS.TABLE_CATALOG</code>.
     */
    public String getTableCatalog();

    /**
     * Setter for <code>INFORMATION_SCHEMA.CONSTRAINTS.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTRAINTS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema();

    /**
     * Setter for <code>INFORMATION_SCHEMA.CONSTRAINTS.TABLE_NAME</code>.
     */
    public void setTableName(String value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTRAINTS.TABLE_NAME</code>.
     */
    public String getTableName();

    /**
     * Setter for <code>INFORMATION_SCHEMA.CONSTRAINTS.UNIQUE_INDEX_NAME</code>.
     */
    public void setUniqueIndexName(String value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTRAINTS.UNIQUE_INDEX_NAME</code>.
     */
    public String getUniqueIndexName();

    /**
     * Setter for <code>INFORMATION_SCHEMA.CONSTRAINTS.CHECK_EXPRESSION</code>.
     */
    public void setCheckExpression(String value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTRAINTS.CHECK_EXPRESSION</code>.
     */
    public String getCheckExpression();

    /**
     * Setter for <code>INFORMATION_SCHEMA.CONSTRAINTS.COLUMN_LIST</code>.
     */
    public void setColumnList(String value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTRAINTS.COLUMN_LIST</code>.
     */
    public String getColumnList();

    /**
     * Setter for <code>INFORMATION_SCHEMA.CONSTRAINTS.REMARKS</code>.
     */
    public void setRemarks(String value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTRAINTS.REMARKS</code>.
     */
    public String getRemarks();

    /**
     * Setter for <code>INFORMATION_SCHEMA.CONSTRAINTS.SQL</code>.
     */
    public void setSql(String value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTRAINTS.SQL</code>.
     */
    public String getSql();

    /**
     * Setter for <code>INFORMATION_SCHEMA.CONSTRAINTS.ID</code>.
     */
    public void setId(Integer value);

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTRAINTS.ID</code>.
     */
    public Integer getId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IConstraints
     */
    public void from(com.jooq.information_schema.tables.interfaces.IConstraints from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IConstraints
     */
    public <E extends com.jooq.information_schema.tables.interfaces.IConstraints> E into(E into);
}