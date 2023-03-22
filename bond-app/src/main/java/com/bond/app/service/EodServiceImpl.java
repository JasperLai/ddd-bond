package com.bond.app.service;

import com.bond.client.dto.result.EodResult;
import com.bond.client.dto.valueobject.EodVO;
import com.bond.domain.model.schedule.Task;
import com.bond.domain.model.schedule.TaskGroup;
import com.bond.domain.model.schedule.ability.ExecuteService;
import com.bond.domain.model.schedule.ability.ScheduleService;
import com.bond.domain.model.schedule.ability.factory.TaskFactory;
import com.bond.domain.model.schedule.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

// app service
public class EodServiceImpl implements com.bond.client.api.EodService {
    @Autowired
    ScheduleService scheduleService;  //调度服务

    @Autowired
    ExecuteService executeService;  //调度服务
    @Autowired
    TaskRepository taskRepo;  //任务REPO，负责读取任务相关表结构

    @Autowired
    TaskFactory taskFactory;
    @Override
    public EodResult executeTaskByGroup(EodVO v) {
        try {
            //Step 1  获得任务组
            TaskGroup group = taskRepo.findTaskGroupById(v.groupId);

            //Step 2  加入调度任务队列
            scheduleService.addTaskForExecute(group);

            //Step 3
            while(scheduleService.peekFromWaiting() != null){
                Task t = scheduleService.pollFromWaiting();
                executeService.execute(t);
            }


        }catch (Exception e){
            //异常需要定义EOD_EXCEPTION
        }
        return null;
    }
}
