package china.lsp.item.service;

/**
 * @Author: liushupeng
 * @Email: 3031353738@qq.com
 * @Date: 2020/1/8 16:05
 * @Version: 1.0
 * @Description: TODO
 */
public interface RedisService {

    Object hget(String hkey, String key);

}
