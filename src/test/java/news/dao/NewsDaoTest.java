package news.dao;

import news.entity.News;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/5/19.
 */
public class NewsDaoTest extends BaseTest {
    @Autowired
    private NewsDao nd;

    @Test
    public void newsQueryAll() throws Exception {
        List<News> newsList = nd.newsQueryAll();
        for (News n : newsList) {
            System.out.println(n);
        }

    }

    @Test
    public void newsInsert() throws Exception {

    }

    @Test
    public void newsUpdata() throws Exception {

    }

    @Test
    public void newsDelete() throws Exception {

    }

}