package news.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 用户
 * Created by Administrator on 2017/5/20.
 */
public class User {
    private Long id;//用户id
    @NotNull(message = "用户名不能为空")
    private String username;//用户昵称
    @NotNull(message = "密码不能为空")
    @Size(min = 6,max = 16,message = "长度为6到16位之间")
    private String password;//用户密码
    private String imgUrl;//头像路径
    private int role;//用户权限

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", role=" + role +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
