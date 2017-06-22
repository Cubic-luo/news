package news.dao;

import news.entity.Task;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/22.
 */
public class TaskDaoTest extends BaseTest {
    @Autowired
    private TaskDao td;

    @Test
    public void taskQueryAll() throws Exception {
        List<Task> taskList = td.taskQueryAll();
        for (Task t : taskList) {
            System.out.println(t);
        }
    }

    @Test
    public void taskQueryByUserId() throws Exception {
        List<Task> taskList = td.taskQueryByUserId(3l);
        for (Task t : taskList) {
            System.out.println(t);
        }
    }

    @Test
    public void tastInsert() throws Exception {
        Task task = new Task();
        task.setUserId(4l);
        task.setMyAnswer("D");
        task.setNewsId(13l);
        task.setCreatTime(new Date());
        td.taskInsert(task);
    }

}