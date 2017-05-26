package news.service.Impl;

import news.dao.NewsDao;
import news.entity.News;
import news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/5/19.
 */
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsDao nd;

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
        news.setCreatTime(new Date());
        return nd.newsInsert(news);
    }

}
