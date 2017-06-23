package news.service.Impl;

import news.dao.NewsDao;
import news.dao.TaskDao;
import news.dao.UserDao;
import news.entity.News;
import news.entity.Task;
import news.entity.User;
import news.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/22.
 */
@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskDao td;
    @Autowired
    private UserDao ud;
    @Autowired
    private NewsDao nd;

    @Override
    public List<Task> taskQueryAll() {
        return td.taskQueryAll();
    }

    @Override
    public List<Task> taskQueryByUserId() {
        String username=getUserName();//获取当前登录用户名
        User user=ud.userSelect(username);
        Long userId=user.getId();//h
        return td.taskQueryByUserId(userId);
    }

    @Override
    public int taskInsert(Task task) {
        String username=getUserName();//获取当前登录用户名
        User user=ud.userSelect(username);//获取当前登录用户
        Long userId=user.getId();//获取当前登录用户id
        Date creatTime=new Date();//用服务器当前时间作为任务完成时间
        task.setCreatTime(creatTime);
        task.setUserId(userId);

        Long newsId=task.getNewsId();//获取所阅读消息的id
        News news= nd.newsQueryById(newsId);
        String rightAnswer=news.getRightAnswer();//获取正确答案
        String myAnswer=task.getMyAnswer();//用户选择的答案
        if (myAnswer.equals(rightAnswer)){
            int newPoint=user.getPoint()+1;
            ud.userUpdatePoint(newPoint,userId);//如果用户答对了题目，增加用户积分
        }
        return td.taskInsert(task);
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
