package news.web;

import news.entity.Task;
import news.service.Impl.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2017/6/22.
 */
@Controller
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskServiceImpl tsi;

    @RequestMapping(value="/insert")
    public String taskInsert(Task task) {
        tsi.taskInsert(task);//将任务插入数据库
        return "redirect:/";//注册成功后返回主页
    }
    @RequestMapping(value = "/history")
    public String taskHistory(Model model){
        List<Task> taskList=tsi.taskQueryByUserId();
        model.addAttribute("taskList",taskList);
        return "taskHistory";
    }
}
