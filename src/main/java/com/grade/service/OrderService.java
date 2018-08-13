package com.grade.service;

import com.grade.common.ServerResponse;
import com.grade.entity.Order;

import java.util.List;

public interface OrderService {
    ServerResponse insert(Order order);

    ServerResponse<List<Order>> selectAll();
}
