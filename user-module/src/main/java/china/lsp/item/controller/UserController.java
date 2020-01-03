package china.lsp.item.controller;

import china.lsp.item.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date: 2020/1/3 10:12
 * @email: 3031353738@qq.com
 * @author: liushupeng
 * @description:
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
