package com.bond.app.transaction;

import com.bond.app.taskService.BatchCashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EodTradeTransaction {
    @Autowired
    BatchCashService bcs;


    public void switchDay(){};

    public boolean doBatchCash(){return true;};

    public void doBatchPayInterest(){};
}
