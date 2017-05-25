package news.service.Impl;

import news.dao.UserDao;
import news.entity.User;
import news.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/5/25.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao ud;

    @Override
    public int userInsert(User user) {
        //		注册密码加密开始
        PasswordEncoder encoder = new StandardPasswordEncoder("hfahdf3");
        String rowPassword = user.getPassword();
        String password = encoder.encode(rowPassword);
        user.setPassword(password);
        //		注册密码加密结束
        user.setImgUrl("logo.png");//设置默认头像
        return ud.userInsert(user);
    }

    @Override
    public User userSelect() {
        String username = getUserName();// 获取当前登录用户名
        return ud.userSelect(username);
    }

    /**
     * 获取认证用户信息详情
     *
     * @return
     */
    private UserDetails getUserDetail() {
        return (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    /**
     * 获取当前认证用户姓名
     *
     * @return
     */
    private String getUserName() {
        String userName = getUserDetail().getUsername();
        return userName;

    }
}
