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
     *
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
    public String newsDetail(@PathVariable Long newsId, Model model) {
        News news = ns.newsQueryById(newsId);
        model.addAttribute("news", news);
        return "newsDetail";
    }

    /**
     * 跳转到新闻管理页面
     *
     * @return
     */
    @RequestMapping(value = "news/manage")
    public String newsManage(Model model) {
        List<News> newsList = ns.newsQueryAll();
        model.addAttribute("newsList", newsList);
        return "newsManage";
    }

    /**
     * 删除新闻
     *
     * @param newsId
     * @return
     */
    @RequestMapping("news/{newsId}/delete")
    public String newsDelete(@PathVariable Long newsId) {
        ns.newsDelete(newsId);
        return "redirect:/news/manage";
    }

    /**
     * 发布新闻
     *
     * @param news
     * @return
     */
    @RequestMapping("news/insert")
    public String newsInsert(News news) {
        int result = ns.newsInsert(news);
        return "redirect:/news/manage";

    }

    /**
     * 跳转到新闻发布页面
     * @return
     */
    @RequestMapping("news/publish")
    public String newsPublish() {
        return "newsPublish";
    }
}
