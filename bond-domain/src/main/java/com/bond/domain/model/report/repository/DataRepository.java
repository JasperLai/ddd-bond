package com.bond.domain.model.report.repository;

import com.bond.domain.model.report.entity.DataReport;

public interface DataRepository {
    //实时销售数据查询
    public String findSalesData(String bondId);

    //日终-开户数据查询
    public DataReport findOpenAccountInfo();

    //日终-汇总数据查询
    public DataReport findAllInfo();


}
