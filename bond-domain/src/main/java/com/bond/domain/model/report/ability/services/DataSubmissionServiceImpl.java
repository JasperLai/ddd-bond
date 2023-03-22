package com.bond.domain.model.report.ability.services;

import com.bond.domain.model.report.ability.facade.ProxyFacade;
import com.bond.domain.model.report.entity.DataReport;
import com.bond.domain.model.report.types.SubmissionId;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class DataSubmissionServiceImpl implements DataSubmissionService{

    @Autowired
    ProxyFacade proxy;

    @Override
    public void notifySubmitFiles() {
        proxy.sendFile();
    }

    @Override
    public void submitData(String data) {

        //TODO 使用factory生成id和对应数据
        DataReport ds = new DataReport(SubmissionId.generateUUID(), new Date(), data);
        ds.validateSubmissionData();

        //TODO call proxy south-api
        proxy.sendData(ds);

    }
}
