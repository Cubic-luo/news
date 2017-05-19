package news.entity;

import java.util.Date;

/**
 * 新闻
 * Created by Administrator on 2017/5/19.
 */
public class News {
    private  Long id;//新闻id
    private String title;//新闻标题
    private String content;//新闻内容
    private Date creatTime;//新闻发布时间
    private String author;//新闻编辑
    private int state;//新闻状态

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", creatTime=" + creatTime +
                ", author='" + author + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
