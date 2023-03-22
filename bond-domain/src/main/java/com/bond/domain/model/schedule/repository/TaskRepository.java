package com.bond.domain.model.schedule.repository;


import com.bond.domain.model.schedule.Task;
import com.bond.domain.model.schedule.TaskGroup;

import java.util.List;

/**
 * @author anzj
 * @date 2022/12/19 11:09
 */
public interface TaskRepository {

    Task findTaskById(String id);
    List<Task> findTaskByStatus(int taskStatus);
    TaskGroup findTaskGroupById(int id);

    void updateTaskStatus(String taskId,boolean status);

}
