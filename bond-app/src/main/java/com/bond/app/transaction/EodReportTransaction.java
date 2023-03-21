package com.bond.app.transaction;

import com.bond.app.taskService.SHReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EodReportTransaction {
    @Autowired
    SHReportService shrs;

    //SHReportManager shrm;

}
