package com.imooc.dto;

import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;

    /** 默认新下单*/
    private Integer orderStatus;

    /** 支付状态 默认0未下单*/
    private Integer payStatus;

    private Date createTime;
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
