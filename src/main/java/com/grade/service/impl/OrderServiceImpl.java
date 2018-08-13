package com.grade.service.impl;

import com.grade.common.ServerResponse;
import com.grade.entity.Order;
import com.grade.entity.OrderExample;
import com.grade.mapper.OrderMapper;
import com.grade.service.OrderService;
import com.grade.util.JsonUtil;
import com.grade.util.MD5Util;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public ServerResponse<List<Order>> selectAll() {
        List<Order> orders = orderMapper.selectByExample(null);
        if(CollectionUtils.isEmpty(orders)){
            return ServerResponse.createByErrorMessage("暂无数据");
        }
        return ServerResponse.createBySuccess("成功",orders);
    }

    @Override
    public ServerResponse insert(Order order) {
        log.info(JsonUtil.obj2String(order));
//        String sign = MD5Util.MD5EncodeUtf8(order.getApp_code() + order.getCtime() + order.getDeviceid() + order.getOrder_id() + order.getTask_id());
//        log.info(sign);
//        if (!sign.equalsIgnoreCase(order.getSign())) {
//            return ServerResponse.createByErrorMessage("签名错误");
//        }
        OrderExample orderExample = new OrderExample();
        orderExample.createCriteria().andTask_idEqualTo(order.getTask_id());
        List<Order> orders = orderMapper.selectByExample(orderExample);
        if (!CollectionUtils.isEmpty(orders)) {
            return ServerResponse.createBySuccessMessage("订单已接收");
        }
        int count = orderMapper.insert(order);
        if(1 != count){
            return ServerResponse.createByErrorMessage("插入失败");
        }
        return ServerResponse.createBySuccessMessage("接收成功");
    }
}
