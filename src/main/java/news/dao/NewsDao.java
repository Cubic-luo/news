package news.dao;

import news.entity.News;

import java.util.List;

/**
 * 消息数据相关接口
 * Created by Administrator on 2017/5/19.
 */
public interface NewsDao {
    /**
     * 查询所有消息
     * @return
     */
    List<News> newsQueryAll();

    /**
     * 根据id查询消息
     * @param newsId 消息id
     * @return
     */
    News newsQueryById(Long newsId);

    /**
     * 根据用户id查询消息
     * @param userId 用户id
     * @return
     */
    List<News> newsQueryByUserId(Long userId);

    /**
     * 插入消息
     * @return
     */
    int newsInsert(News news);

    /**
     * 修改消息
     * @return
     */
    int newsUpdata(News news);

    /**
     * 删除消息
     * @param newsId 消息id
     * @return
     */
    int newsDelete(Long newsId);
}
