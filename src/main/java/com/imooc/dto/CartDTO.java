package com.imooc.dto;

import lombok.Getter;

@Getter
public class CartDTO {
    /**
     * id
     */
    private String productId;

    /**
     * 商品
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
