/*
 * This file is generated by jOOQ.
*/
package com.jooq.information_schema.tables.pojos;


import com.jooq.information_schema.tables.interfaces.ISchemata;

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
public class Schemata implements ISchemata {

    private static final long serialVersionUID = -970106188;

    private String  catalogName;
    private String  schemaName;
    private String  schemaOwner;
    private String  defaultCharacterSetName;
    private String  defaultCollationName;
    private Boolean isDefault;
    private String  remarks;
    private Integer id;

    public Schemata() {}

    public Schemata(Schemata value) {
        this.catalogName = value.catalogName;
        this.schemaName = value.schemaName;
        this.schemaOwner = value.schemaOwner;
        this.defaultCharacterSetName = value.defaultCharacterSetName;
        this.defaultCollationName = value.defaultCollationName;
        this.isDefault = value.isDefault;
        this.remarks = value.remarks;
        this.id = value.id;
    }

    public Schemata(
        String  catalogName,
        String  schemaName,
        String  schemaOwner,
        String  defaultCharacterSetName,
        String  defaultCollationName,
        Boolean isDefault,
        String  remarks,
        Integer id
    ) {
        this.catalogName = catalogName;
        this.schemaName = schemaName;
        this.schemaOwner = schemaOwner;
        this.defaultCharacterSetName = defaultCharacterSetName;
        this.defaultCollationName = defaultCollationName;
        this.isDefault = isDefault;
        this.remarks = remarks;
        this.id = id;
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
    public String getSchemaName() {
        return this.schemaName;
    }

    @Override
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    @Override
    public String getSchemaOwner() {
        return this.schemaOwner;
    }

    @Override
    public void setSchemaOwner(String schemaOwner) {
        this.schemaOwner = schemaOwner;
    }

    @Override
    public String getDefaultCharacterSetName() {
        return this.defaultCharacterSetName;
    }

    @Override
    public void setDefaultCharacterSetName(String defaultCharacterSetName) {
        this.defaultCharacterSetName = defaultCharacterSetName;
    }

    @Override
    public String getDefaultCollationName() {
        return this.defaultCollationName;
    }

    @Override
    public void setDefaultCollationName(String defaultCollationName) {
        this.defaultCollationName = defaultCollationName;
    }

    @Override
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    @Override
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String getRemarks() {
        return this.remarks;
    }

    @Override
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Schemata (");

        sb.append(catalogName);
        sb.append(", ").append(schemaName);
        sb.append(", ").append(schemaOwner);
        sb.append(", ").append(defaultCharacterSetName);
        sb.append(", ").append(defaultCollationName);
        sb.append(", ").append(isDefault);
        sb.append(", ").append(remarks);
        sb.append(", ").append(id);

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
    public void from(ISchemata from) {
        setCatalogName(from.getCatalogName());
        setSchemaName(from.getSchemaName());
        setSchemaOwner(from.getSchemaOwner());
        setDefaultCharacterSetName(from.getDefaultCharacterSetName());
        setDefaultCollationName(from.getDefaultCollationName());
        setIsDefault(from.getIsDefault());
        setRemarks(from.getRemarks());
        setId(from.getId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISchemata> E into(E into) {
        into.from(this);
        return into;
    }
}