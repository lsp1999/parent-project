package china.lsp.item.controller;

import china.lsp.item.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liushupeng
 * @Email: 3031353738@qq.com
 * @Date: 2020/1/8 16:05
 * @Version: 1.0
 * @Description: TODO
 */
@RestController
@RequestMapping(value = "/rest/api/1/user")
public class UserController {

    @Autowired
    private RedisService redisService;

    @GetMapping(value = "name")
    public Object name() {
        return redisService.hget("user:1", "name");
    }

}
