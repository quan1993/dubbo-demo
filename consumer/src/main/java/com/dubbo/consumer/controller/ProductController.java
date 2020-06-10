package com.dubbo.consumer.controller;

import com.dubbo.consumer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jipengquan
 * @date 2020-06-10
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * 添加完 返回总共消费
     * @param a
     * @return
     */
    @PostMapping("/add")
    public String getCost(int a){
        return "该产品总共消费 ："+productService.getCost(a);
    }
}
