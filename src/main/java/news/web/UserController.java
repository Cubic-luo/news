package news.web;

import news.entity.User;
import news.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * 个人中心
 * Created by Administrator on 2017/5/24.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl usi;

    /**
     * 跳转到个人中心
     *
     * @return
     */
    @RequestMapping()
    public String userCenter(Model model) {
        User user=usi.userSelect();//查询当前登录用户信息
        model.addAttribute("user",user);
        return "user";
    }

    /**
     * 跳转到登录页面
     *
     * @return
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * 跳转到注册页面
     *
     * @return
     */
    @RequestMapping("/showRegister")
    public String showRegister() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Valid User user, Errors errors) {
        if (errors.hasErrors()) {
            return "register";//如果验证注册信息失败，重新返回注册页面
        } else {
            usi.userInsert(user);
            return "redirect:/";//注册成功后返回主页

        }

    }
}
