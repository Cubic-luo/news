package news.dao;

import news.entity.Task;

import java.util.List;

/**
 * 阅读任务数据接口
 * Created by Administrator on 2017/6/22.
 */
public interface TaskDao {
    /**
     * 查询所有任务
     *
     * @return
     */
    List<Task> taskQueryAll();

    /**
     * 根据用户id查询用户做过的任务
     *
     * @param userId
     * @return
     */
    List<Task> taskQueryByUserId(Long userId);

    /**
     * 插入任务
     *
     * @param task
     * @return
     */
    int taskInsert(Task task);

}
