package com.bond.app.schedule.ability;

import org.springframework.beans.factory.annotation.Autowired;
import com.bond.app.schedule.Task;
import com.bond.app.schedule.repository.TaskRepository;

public class ExecuteService {

    @Autowired
    TaskRepository repo;

    public void execute(Task task){
        //do task
        switch (task.getTaskId()){
            default:

        }
        repo.updateTaskStatus(task.getTaskId(), true);
    }

}
