package com.bond.domain.model.schedule.ability;

import com.bond.domain.model.schedule.Task;
import com.bond.domain.model.schedule.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

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
