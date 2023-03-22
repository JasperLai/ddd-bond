package com.bond.app.schedule.ability;

import org.springframework.stereotype.Component;
import com.bond.app.schedule.Task;
import com.bond.app.schedule.TaskGroup;

import java.util.List;
import java.util.Queue;

/**
 * 主要负责任务的调度，控制执行的顺序。
 * 他从任务信息表中获取任务的前后关系，并按照关系，派发给对应的taskExecutor执行。
 * 具体任务的执行由app层的taskService完成
 */
@Component
public class ScheduleService {
    Queue<Task> tasksWaitForExecute;
    List<Task> tasksExecuted;

    public void addTaskForExecute(TaskGroup group){
        //TODO 将待执行队列taskWaitForExecute初始化
//        tasksWaitForExecute = group.getGroupTasksInOrder()
    }

    public Task pollFromWaiting(){
        return tasksWaitForExecute.poll();
    }
    public Task peekFromWaiting(){
        return tasksWaitForExecute.peek();
    }





}
