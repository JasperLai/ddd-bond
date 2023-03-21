package com.bond.domain.model.eod.repository;


import com.bond.domain.model.eod.Task;

import java.util.List;
import java.util.Queue;

/**
 * @author anzj
 * @date 2022/12/19 11:09
 */
public interface TaskRepository {

    Task find(String id);
    List<Task> findTaskByStatus(int taskStatus);
    List<Task> findTaskByType(int tasktype);

    void updateTaskStatus(String taskId,boolean status);
    Queue<Task> initTaskAtBeginning();

}
