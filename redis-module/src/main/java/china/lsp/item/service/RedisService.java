package china.lsp.item.service;

/**
 * @date: 2019/12/30 17:16
 * @email: 3031353738@qq.com
 * @author: liushupeng
 * @description:
 */
public interface RedisService {


    boolean exists(String key);

    /**
     * 判断hmap里面具体某个字段是否存在
     *
     * @param h
     * @param key
     * @return
     */
    boolean hxists(String h, String key);

    Object hget(String hkey, String key);

    /**
     * 存储数据
     */
    void set(String key, String value);

    /**
     * 获取数据
     */
    String get(String key);

    /**
     * 设置超期时间
     */
    boolean expire(String key, long expire);

    /**
     * 删除数据
     */
    void remove(String key);

    /**
     * 自增操作
     *
     * @param delta 自增步长
     */
    Long increment(String key, long delta);
}
