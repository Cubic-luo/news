package news.web;

import news.entity.News;
import news.service.Impl.NewsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2017/5/19.
 */
@Controller
@RequestMapping("/")
public class NewsController {
    @Autowired
    private NewsServiceImpl ns;

    /**
     * 展示首页，新闻列表
     * @param model
     * @return
     */
    @RequestMapping()
    public String newsShowAll(Model model) {
        List<News> newsList = ns.newsQueryAll();
        model.addAttribute("newsList", newsList);
        return "index";
    }
    @RequestMapping(value = "news/{newsId}/showDetail")
    public String newsDetail(@PathVariable Long newsId,Model model){
        News news=ns.newsQueryById(newsId);
        model.addAttribute("news",news);
        return "newsDetail";
    }
}
