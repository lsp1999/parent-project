package com.demo.controller;

import com.demo.util.RedisService;
import com.demo.util.RedisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date: 2019/12/30 11:11
 * @email: 3031353738@qq.com
 * @author: liushupeng
 * @description: jedis
 */
@RestController
public class DemoController {

    @Autowired
    private RedisService redisService;

    @GetMapping(value = "getname")
    public Object getname() {
        String key = "age";
        if (redisService.exists(key)) {
            redisService.expire(key,60);
            System.out.println(redisService.get(key));

        } else {
            redisService.set(key, "30");
            System.out.println("已存入");
        }
        return null;
    }

}
