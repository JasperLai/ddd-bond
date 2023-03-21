package com.bond.app;

import com.bond.app.taskExecutor.BatchCashExecutor;
import com.bond.app.taskExecutor.SHOpenAccReportExecutor;
import com.bond.app.taskExecutor.TaskExecutor;
import com.bond.domain.model.eod.Task;
import com.bond.domain.model.trade.Bond;
import com.bond.domain.model.trade.repository.BondRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * 根据任务ID构建不同的Service
 */
public class TaskFactory {
    private static TaskFactory tf;

    @Autowired
    BondRepository bondRepo;

    public static TaskFactory getInstance() {
        if (tf == null) {
            tf = new TaskFactory();
        }
        return tf;
    }

    public TaskExecutor getTaskExecutor(String taskid){
        TaskExecutor t = null;
        switch(taskid){
            default:
                //以生成上请所开户任务为例
                Bond b = bondRepo.find("123456");  //构造对应的domain对象
                t = new SHOpenAccReportExecutor(new Date()); //构造对应的executor

        }
        return t;
    }


}
