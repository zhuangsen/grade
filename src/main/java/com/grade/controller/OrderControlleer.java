package com.grade.controller;

import com.grade.common.ServerResponse;
import com.grade.entity.AppOrder;
import com.grade.entity.Order;
import com.grade.service.AppOrderService;
import com.grade.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("order")
public class OrderControlleer {

    @Autowired
    private OrderService orderService;

    @Autowired
    private AppOrderService appOrderService;

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "info")
    @ResponseBody
    public ServerResponse info(Order order){
        return orderService.insert(order);
    }

    @RequestMapping(value = "list")
    @ResponseBody
    public ServerResponse<List<Order>> list(){
        return orderService.selectAll();
    }

    @RequestMapping(value = "app")
    @ResponseBody
    public ServerResponse info(AppOrder appOrder){
        return appOrderService.insert(appOrder);
    }

    @RequestMapping(value = "all")
    @ResponseBody
    public ServerResponse<List<AppOrder>> listOrder(){
        return appOrderService.selectAll();
    }
}
