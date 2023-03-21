package com.bond.domain.model.eod.repository;


import com.bond.domain.model.eod.Task;
import com.bond.domain.model.eod.TaskGroup;

import java.util.List;
import java.util.Queue;

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
