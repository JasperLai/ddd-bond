package com.bond.app.schedule.repository;


import com.bond.app.schedule.Task;
import com.bond.app.schedule.TaskGroup;

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
