package news.dao;

import news.entity.News;

import java.util.List;

/**
 * 新闻数据相关接口
 * Created by Administrator on 2017/5/19.
 */
public interface NewsDao {
    /**
     * 查询所有评论
     * @return
     */
    List<News> newsQueryAll();

    /**
     * 根据id查询新闻
     * @param newsId 新闻id
     * @return
     */
    News newsQueryById(Long newsId);

    /**
     * 插入新闻
     * @return
     */
    int newsInsert(News news);

    /**
     * 修改新闻
     * @return
     */
    public int newsUpdata(News news);

    /**
     * 删除新闻
     * @param newsId 新闻id
     * @return
     */
    int newsDelete(Long newsId);
}
