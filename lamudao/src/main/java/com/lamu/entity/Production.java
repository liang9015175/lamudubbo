package com.lamu.entity;

import java.math.BigDecimal;

public class Production {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.category_id
     *
     * @mbg.generated
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.despriction
     *
     * @mbg.generated
     */
    private String despriction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.discount
     *
     * @mbg.generated
     */
    private Integer discount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.unit
     *
     * @mbg.generated
     */
    private String unit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.recommand
     *
     * @mbg.generated
     */
    private Integer recommand;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.keyword
     *
     * @mbg.generated
     */
    private String keyword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.id
     *
     * @return the value of production.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.id
     *
     * @param id the value for production.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.name
     *
     * @return the value of production.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.name
     *
     * @param name the value for production.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.category_id
     *
     * @return the value of production.category_id
     *
     * @mbg.generated
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.category_id
     *
     * @param categoryId the value for production.category_id
     *
     * @mbg.generated
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.despriction
     *
     * @return the value of production.despriction
     *
     * @mbg.generated
     */
    public String getDespriction() {
        return despriction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.despriction
     *
     * @param despriction the value for production.despriction
     *
     * @mbg.generated
     */
    public void setDespriction(String despriction) {
        this.despriction = despriction == null ? null : despriction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.price
     *
     * @return the value of production.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.price
     *
     * @param price the value for production.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.discount
     *
     * @return the value of production.discount
     *
     * @mbg.generated
     */
    public Integer getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.discount
     *
     * @param discount the value for production.discount
     *
     * @mbg.generated
     */
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.unit
     *
     * @return the value of production.unit
     *
     * @mbg.generated
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.unit
     *
     * @param unit the value for production.unit
     *
     * @mbg.generated
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.recommand
     *
     * @return the value of production.recommand
     *
     * @mbg.generated
     */
    public Integer getRecommand() {
        return recommand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.recommand
     *
     * @param recommand the value for production.recommand
     *
     * @mbg.generated
     */
    public void setRecommand(Integer recommand) {
        this.recommand = recommand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.keyword
     *
     * @return the value of production.keyword
     *
     * @mbg.generated
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.keyword
     *
     * @param keyword the value for production.keyword
     *
     * @mbg.generated
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }
}