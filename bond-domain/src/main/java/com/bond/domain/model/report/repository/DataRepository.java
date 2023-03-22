package com.bond.domain.model.report.repository;

import com.bond.domain.model.report.entity.DataSubmission;

import java.util.ArrayList;
import java.util.Date;

public interface DataRepository {
    //实时销售数据查询
    public String findSalesData(String bondId);

    //日终-开户数据查询
    public DataSubmission findOpenAccountInfo();

    //日终-汇总数据查询
    public DataSubmission findAllInfo();


}
