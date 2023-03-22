package com.bond.app.service;

import com.bond.client.dto.protocol.response.FileInfoResponse;
import com.bond.domain.model.report.ability.services.DataSourceService;
import com.bond.domain.model.report.ability.services.DataSubmissionService;
import com.bond.domain.model.report.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DataService {
    @Autowired
    DataSubmissionService dataSubmissionService;
    @Autowired
    DataSourceService dataSourceService;

    public void sendDayEndFile(){
        dataSubmissionService.notifySubmitFiles();
    }

    public void sendRealtimeBondSales(String bondId){
        String salesData = dataSourceService.getSalesInfo(bondId);
        dataSubmissionService.submitData(salesData);
    }

    public FileInfoResponse getReportFiles(){
        dataSourceService.getAllFileInfo();
        return null;
    }




}
