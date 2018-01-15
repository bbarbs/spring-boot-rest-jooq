/*
 * This file is generated by jOOQ.
*/
package com.jooq.information_schema.tables.pojos;


import com.jooq.information_schema.tables.interfaces.IDomains;

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
public class Domains implements IDomains {

    private static final long serialVersionUID = 1607550315;

    private String  domainCatalog;
    private String  domainSchema;
    private String  domainName;
    private String  columnDefault;
    private String  isNullable;
    private Integer dataType;
    private Integer precision;
    private Integer scale;
    private String  typeName;
    private Integer selectivity;
    private String  checkConstraint;
    private String  remarks;
    private String  sql;
    private Integer id;

    public Domains() {}

    public Domains(Domains value) {
        this.domainCatalog = value.domainCatalog;
        this.domainSchema = value.domainSchema;
        this.domainName = value.domainName;
        this.columnDefault = value.columnDefault;
        this.isNullable = value.isNullable;
        this.dataType = value.dataType;
        this.precision = value.precision;
        this.scale = value.scale;
        this.typeName = value.typeName;
        this.selectivity = value.selectivity;
        this.checkConstraint = value.checkConstraint;
        this.remarks = value.remarks;
        this.sql = value.sql;
        this.id = value.id;
    }

    public Domains(
        String  domainCatalog,
        String  domainSchema,
        String  domainName,
        String  columnDefault,
        String  isNullable,
        Integer dataType,
        Integer precision,
        Integer scale,
        String  typeName,
        Integer selectivity,
        String  checkConstraint,
        String  remarks,
        String  sql,
        Integer id
    ) {
        this.domainCatalog = domainCatalog;
        this.domainSchema = domainSchema;
        this.domainName = domainName;
        this.columnDefault = columnDefault;
        this.isNullable = isNullable;
        this.dataType = dataType;
        this.precision = precision;
        this.scale = scale;
        this.typeName = typeName;
        this.selectivity = selectivity;
        this.checkConstraint = checkConstraint;
        this.remarks = remarks;
        this.sql = sql;
        this.id = id;
    }

    @Override
    public String getDomainCatalog() {
        return this.domainCatalog;
    }

    @Override
    public void setDomainCatalog(String domainCatalog) {
        this.domainCatalog = domainCatalog;
    }

    @Override
    public String getDomainSchema() {
        return this.domainSchema;
    }

    @Override
    public void setDomainSchema(String domainSchema) {
        this.domainSchema = domainSchema;
    }

    @Override
    public String getDomainName() {
        return this.domainName;
    }

    @Override
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    @Override
    public String getColumnDefault() {
        return this.columnDefault;
    }

    @Override
    public void setColumnDefault(String columnDefault) {
        this.columnDefault = columnDefault;
    }

    @Override
    public String getIsNullable() {
        return this.isNullable;
    }

    @Override
    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
    }

    @Override
    public Integer getDataType() {
        return this.dataType;
    }

    @Override
    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    @Override
    public Integer getPrecision() {
        return this.precision;
    }

    @Override
    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    @Override
    public Integer getScale() {
        return this.scale;
    }

    @Override
    public void setScale(Integer scale) {
        this.scale = scale;
    }

    @Override
    public String getTypeName() {
        return this.typeName;
    }

    @Override
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public Integer getSelectivity() {
        return this.selectivity;
    }

    @Override
    public void setSelectivity(Integer selectivity) {
        this.selectivity = selectivity;
    }

    @Override
    public String getCheckConstraint() {
        return this.checkConstraint;
    }

    @Override
    public void setCheckConstraint(String checkConstraint) {
        this.checkConstraint = checkConstraint;
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
    public String getSql() {
        return this.sql;
    }

    @Override
    public void setSql(String sql) {
        this.sql = sql;
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
        StringBuilder sb = new StringBuilder("Domains (");

        sb.append(domainCatalog);
        sb.append(", ").append(domainSchema);
        sb.append(", ").append(domainName);
        sb.append(", ").append(columnDefault);
        sb.append(", ").append(isNullable);
        sb.append(", ").append(dataType);
        sb.append(", ").append(precision);
        sb.append(", ").append(scale);
        sb.append(", ").append(typeName);
        sb.append(", ").append(selectivity);
        sb.append(", ").append(checkConstraint);
        sb.append(", ").append(remarks);
        sb.append(", ").append(sql);
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
    public void from(IDomains from) {
        setDomainCatalog(from.getDomainCatalog());
        setDomainSchema(from.getDomainSchema());
        setDomainName(from.getDomainName());
        setColumnDefault(from.getColumnDefault());
        setIsNullable(from.getIsNullable());
        setDataType(from.getDataType());
        setPrecision(from.getPrecision());
        setScale(from.getScale());
        setTypeName(from.getTypeName());
        setSelectivity(from.getSelectivity());
        setCheckConstraint(from.getCheckConstraint());
        setRemarks(from.getRemarks());
        setSql(from.getSql());
        setId(from.getId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IDomains> E into(E into) {
        into.from(this);
        return into;
    }
}