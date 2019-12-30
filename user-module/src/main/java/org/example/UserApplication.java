package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date: 2019/12/19 17:11
 * @email: 3031353738@qq.com
 * @author: liushupeng
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    @GetMapping(value = "/name")
    public String name(){return "liushupeng";}

}
