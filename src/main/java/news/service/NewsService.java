package news.service;

import news.entity.News;

import java.util.List;

/**
 * 新闻
 * Created by Administrator on 2017/5/19.
 */
public interface NewsService {
    /**
     * 查询所有新闻
     * @return
     */
    List<News> newsQueryAll();

    /**
     * 根据id查询新闻
     * @param newsId 新闻id
     * @return
     */
    News newsQueryById(long newsId);

}
