package news.dao;

import news.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/6/20.
 */
public class UserDaoTest extends BaseTest {
    @Autowired
    private UserDao ud;
    @Test
    public void userInsert() throws Exception {
        User user= new User();
        user.setUsername("测试1号");
        ud.userInsert(user);
    }

    @Test
    public void userSelect() throws Exception {

    }

}