package news.service;

import news.entity.Task;

import java.util.List;

/**
 * Created by Administrator on 2017/6/22.
 */
public interface TaskService {
    /**
     * 查询所有任务
     *
     * @return
     */
    List<Task> taskQueryAll();

    /**
     * 根据用户id查询用户做过的任务
     *
     * @return
     */
    List<Task> taskQueryByUserId();

    /**
     * 插入任务
     *
     * @param task
     * @return
     */
    int taskInsert(Task task);
}
