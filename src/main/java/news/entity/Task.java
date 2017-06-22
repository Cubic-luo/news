package news.entity;

import java.util.Date;

/**
 * 任务
 * Created by Administrator on 2017/6/22.
 */
public class Task {
    private Long userId;//用户id
    private Long newsId;//所阅读的消息id
    private String myAnswer;//所回答问题的答案
    private Date creatTime;//创建时间
    private News news;//所阅读的消息
    private User user;//用户信息

    @Override
    public String toString() {
        return "Task{" +
                "userId=" + userId +
                ", newsId=" + newsId +
                ", myAnswer='" + myAnswer + '\'' +
                ", creatTime=" + creatTime +
                ", news=" + news +
                ", user=" + user +
                '}';
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public String getMyAnswer() {
        return myAnswer;
    }

    public void setMyAnswer(String myAnswer) {
        this.myAnswer = myAnswer;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
