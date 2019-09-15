package com.xzq.product.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 类ProductCategoryDO.java的实现描述：
 * 
 * @Author xzq
 * @Date 2019年09月15日
 */
@Data
@Entity
public class ProductCategory {
    /**
     * categoryId
     */
    @Id
    @GeneratedValue
    private Integer categoryId;
    /**
     * 类目名字
     */
    private String categoryName;
    /**
     * 类目编号
     */
    private Integer categoryType;
    /**
     * 创建时间
     */
    private java.util.Date createTime;
    /**
     * 修改时间
     */
    private java.util.Date updateTime;
}