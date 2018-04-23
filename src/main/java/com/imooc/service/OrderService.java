package com.imooc.service;

import com.imooc.dataobject.OrderMaster;
import com.imooc.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {
    /** 创建订单*/
    OrderDTO create(OrderDTO orderDTO);

    /** 查询单个订单*/
    OrderDTO findOne(String orderId);

    /** 查询订单列表*/
    Page<OrderDTO> findList(String buyerOpenId, Pageable pageable);

    /** 取消列表*/
    OrderDTO cancel(OrderDTO orderDTO);

    /** 完结列表*/
    OrderDTO finish(OrderDTO orderDTO);

    /** 支付列表*/
    OrderDTO paid(OrderDTO orderDTO);
}
