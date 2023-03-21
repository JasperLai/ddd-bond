package com.bond.domain.model.eod.ability;

import com.bond.domain.model.eod.Task;
import com.bond.domain.model.eod.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;

public class ExecuteService {

    @Autowired
    TaskRepository repo;

    public void execute(Task task){
        //do task

        repo.updateTaskStatus(task.getTaskId(), true);
    }

    private TaskExecutor getExecutor(String taskID){
        switch(taskID){
            default:
                //以生成上请所开户任务为例
//                t = new SHOpenAccReportExecutor(new Date()); //构造对应的executor

        }
        return null;
    }
}
