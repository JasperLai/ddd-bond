package com.bond.domain.model.eod.ability;

import com.bond.domain.model.eod.Task;
import com.bond.domain.model.eod.repository.TaskRepository;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/**
 * EodManager主要负责任务的调度，控制执行的顺序。
 * 他从任务信息表中获取任务的前后关系，并按照关系，派发给对应的taskExecutor执行。
 * 具体任务的执行由app层的taskService完成
 */
@Component
public class EodManager {
    Queue<Task> tasksWaitForExecute;
    List<Task> tasksExecuted;

    public void  handleDayEndTask(List<Task> dayEndTasks){
        Iterator<Task> iterator = dayEndTasks.iterator();
        while(iterator.hasNext()){
            Task t = iterator.next();
        }

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

    public void  handleDayStartTask(List<Task> dayStartTask){}


    public boolean checkDayEndTaskStatus(){
        return true;
    }


    public void executeTask(Task t){

    }



}
