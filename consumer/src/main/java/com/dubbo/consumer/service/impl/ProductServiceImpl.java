package com.dubbo.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.CostService;
import com.dubbo.consumer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jipengquan
 * @date 2020-06-10
 */
@Service
public class ProductServiceImpl implements ProductService {

    /**
     * 使用dubbo的注解 com.alibaba.dubbo.config.annotation.Reference。进行远程调用service
     */
//    @Autowired 会找不到costService
    @Reference
    private CostService costService;

    @Override
    public Integer getCost(int a) {
        return costService.add(a);
    }
}
