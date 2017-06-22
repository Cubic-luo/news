package news.service.Impl;

import news.dao.NewsDao;
import news.dao.UserDao;
import news.entity.News;
import news.entity.User;
import news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/5/19.
 */
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsDao nd;
    @Autowired
    private UserDao ud;

    @Override
    public List<News> newsQueryAll() {
        return nd.newsQueryAll();
    }

    @Override
    public News newsQueryById(long newsId) {
        return nd.newsQueryById(newsId);
    }

    @Override
    public int newsDelete(Long newsId) {
        return nd.newsDelete(newsId);
    }

    @Override
    public int newsInsert(News news) {
        String username=getUserName();//获取当前登录用户名
        User user= ud.userSelect(username);//根据用户名查询已登录用户信息
        Long userId=user.getId();//获取用户id
        news.setUserId(userId);
        news.setCreatTime(new Date());
        return nd.newsInsert(news);
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
