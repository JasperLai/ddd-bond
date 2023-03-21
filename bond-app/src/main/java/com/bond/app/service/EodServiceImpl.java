package com.bond.app.service;

import com.bond.app.TaskFactory;
import com.bond.app.taskExecutor.TaskExecutor;
import com.bond.app.transaction.EodTradeTransaction;
import com.bond.client.api.EodService;
import com.bond.client.dto.result.EodResult;
import com.bond.client.dto.valueobject.EodVO;
import com.bond.domain.model.eod.Task;
import com.bond.domain.model.eod.ability.EodManager;
import com.bond.domain.model.eod.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Queue;

// app service
public class EodServiceImpl implements EodService {
    @Autowired
    EodManager manager;  //对应DDD service_rules, 反应队列调度规则

    @Autowired
    EodTradeTransaction eodTradeTransaction;  //app service 子服务
    @Autowired
    TaskRepository taskRepo;  //任务REPO，负责读取任务相关表结构
    @Override
    public EodResult executeTask(EodVO v) {
        try {
            if (v.type == 0) { //任务类型0
                //数据库读取任务状态，构建任务队列，需要考虑任务组合下各任务的前后关系
                manager.handleDayEndTask(taskRepo.findTaskByType(v.type));

                //根据任务类型创建对应执行器，并更新任务状态
                //TODO 如果需要改为多线程，修改while逻辑即可
                while(manager.peekFromWaiting()!=null){
                    Task t = manager.pollFromWaiting();
                    TaskExecutor executor = TaskFactory.getInstance().getTaskExecutor(t.getTaskId());
                    int result = executor.execute();
                    t.setTaskStatus(result);
                    manager.updateTaskStatus(t,taskRepo);
                    //throw exception
                }

            } else if(v.type == 1){

            }
        }catch (Exception e){
            //异常需要定义EOD_EXCEPTION
        }
        return null;
    }
}
