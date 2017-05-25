package news.service;

import news.entity.User;

/**
 * Created by Administrator on 2017/5/25.
 */
public interface UserService {
    /**
     * 注册用户
     * @param user
     * @return
     */
    int userInsert(User user);

    /**
     * 查询当前登录用户信息
     * @return
     */
    User userSelect();
}
