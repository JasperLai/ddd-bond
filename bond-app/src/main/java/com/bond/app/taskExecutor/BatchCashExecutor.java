package com.bond.app.taskExecutor;

import com.bond.app.taskService.BatchCashService;
import org.springframework.beans.factory.annotation.Autowired;

public class BatchCashExecutor extends TaskExecutor{

    @Autowired
    BatchCashService service;
    @Override
    public int execute() {

        service.cashOut();;

        return 1;
    }
}
