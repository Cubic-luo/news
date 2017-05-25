package news.dao;

import news.entity.User;

/**
 * 用户相关接口
 * Created by Administrator on 2017/5/25.
 */
public interface UserDao {
    /**
     * 注册一个用户
     * @param user 用户实体
     * @return
     */
    int userInsert(User user);

    /**
     * 根据用户名查询用户
     * @param username
     * @return
     */
    User userSelect(String username);
}
