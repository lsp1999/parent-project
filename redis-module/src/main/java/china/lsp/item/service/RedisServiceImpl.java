package china.lsp.item.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @Author: liushupeng
 * @Email: 3031353738@qq.com
 * @Date: 2020/1/8 16:05
 * @Version: 1.0
 * @Description: TODO
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public Object hget(String hkey, String key) {
        return stringRedisTemplate.opsForHash().get(hkey, key);
    }

}