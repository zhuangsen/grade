package com.grade.service;

import com.grade.common.ServerResponse;
import com.grade.entity.AppOrder;

import java.util.List;

public interface AppOrderService {
    ServerResponse insert(AppOrder appOrder);

    ServerResponse<List<AppOrder>> selectAll();
}
