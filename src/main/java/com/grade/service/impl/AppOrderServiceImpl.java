package com.grade.service.impl;

import com.grade.common.ServerResponse;
import com.grade.entity.AppOrder;
import com.grade.entity.AppOrderExample;
import com.grade.mapper.AppOrderMapper;
import com.grade.service.AppOrderService;
import com.grade.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
@Slf4j
public class AppOrderServiceImpl implements AppOrderService {

    @Autowired
    private AppOrderMapper appOrderMapper;

    @Override
    public ServerResponse insert(AppOrder appOrder) {
        log.info(JsonUtil.obj2String(appOrder));
//        String sign = MD5Util.MD5EncodeUtf8(appOrder.getApp_code() + appOrder.getCtime() + appOrder.getDeviceid() + appOrder.getOrder_id() + appOrder.getTask_id());
//        log.info(sign);
//        if (!sign.equalsIgnoreCase(appOrder.getSign())) {
//            return ServerResponse.createByErrorMessage("签名错误");
//        }
        AppOrderExample example = new AppOrderExample();
        example.createCriteria().andOrderEqualTo(appOrder.getOrder());
        List<AppOrder> orders = appOrderMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(orders)) {
            return ServerResponse.createByErrorMessage("订单已接收");
        }
        int count = appOrderMapper.insert(appOrder);
        if(1 != count){
            return ServerResponse.createByErrorMessage("接收失败");
        }
        return ServerResponse.createBySuccessMessage("接收成功");
    }

    @Override
    public ServerResponse<List<AppOrder>> selectAll() {
        List<AppOrder> orders = appOrderMapper.selectByExample(null);
        if(CollectionUtils.isEmpty(orders)){
            return ServerResponse.createByErrorMessage("暂无数据");
        }
        return ServerResponse.createBySuccess("成功",orders);
    }
}
