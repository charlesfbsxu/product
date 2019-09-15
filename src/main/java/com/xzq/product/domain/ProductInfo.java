package com.xzq.product.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 类ProductInfoDO.java的实现描述：
 * 
 * @Author xzq
 * @Date 2019年09月15日
 */
@Data
@Entity
public class ProductInfo {
    /**
     * productId
     */
    @Id
    private String productId;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 单价
     */
    private java.math.BigDecimal productPrice;
    /**
     * 库存
     */
    private Integer productStock;
    /**
     * 描述
     */
    private String productDescription;
    /**
     * 小图
     */
    private String productIcon;
    /**
     * 商品状态,0正常1下架
     */
    private Integer productStatus;
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