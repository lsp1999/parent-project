package china.lsp.item.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @date: 2019/12/30 14:09
 * @email: 3031353738@qq.com
 * @author: liushupeng
 * @description: RedisPoolUtil
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public boolean exists(String key) {
        return stringRedisTemplate.hasKey(key);
    }

    public boolean hxists(String h, String key) {
        return stringRedisTemplate.opsForHash().hasKey(h, key);
    }

    public Object hget(String hkey, String key) {
        return stringRedisTemplate.opsForHash().get(hkey, key);
    }

    public void set(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }

    public String get(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    public boolean expire(String key, long expire) {
        return stringRedisTemplate.expire(key, expire, TimeUnit.SECONDS);
    }

    public void remove(String key) {
        stringRedisTemplate.delete(key);
    }

    public Long increment(String key, long delta) {
        return stringRedisTemplate.opsForValue().increment(key, delta);
    }

}