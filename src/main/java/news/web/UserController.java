package news.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 个人中心
 * Created by Administrator on 2017/5/24.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 跳转到个人中心
     * @return
     */
    @RequestMapping()
    public String userCenter() {
        return "center";
    }

    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
