package com.bond.domain.model.eod.ability;

import com.bond.domain.model.eod.TaskGroup;
import com.bond.domain.model.eod.repository.TaskRepository;
import com.bond.domain.model.eod.Task;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Queue;

/**
 * EodManager主要负责任务的调度，控制执行的顺序。
 * 他从任务信息表中获取任务的前后关系，并按照关系，派发给对应的taskExecutor执行。
 * 具体任务的执行由app层的taskService完成
 */
@Component
public class ScheduleService {
    Queue<Task> tasksWaitForExecute;
    List<Task> tasksExecuted;

    public void addTaskForExecute(TaskGroup group){
        //TODO 将taskWaitForExecute按队列初始化
//        tasksWaitForExecute = group.getGroupTasksInOrder()
    }


    public void updateTaskStatus(Task t, TaskRepository repo){
        //更新任务状态，维护已执行任务队列，并更新数据库状态
    }
    public Task pollFromWaiting(){
        return tasksWaitForExecute.poll();
    }
    public Task peekFromWaiting(){
        return tasksWaitForExecute.peek();
    }





}
