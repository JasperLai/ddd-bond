package com.bond.domain.model.report.ability.services;

import com.bond.domain.model.report.ability.facade.ProxyFacade;
import com.bond.domain.model.report.aggregate.DataSubmissionAggregate;
import com.bond.domain.model.report.entity.DataSubmission;
import com.bond.domain.model.report.repository.DataRepository;
import com.bond.domain.model.report.types.SubmissionId;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class DataSubmissionServiceImpl implements DataSubmissionService{

    public DataSubmissionAggregate aggregate;

    @Autowired
    ProxyFacade proxy;

    @Override
    public void notifySubmitFiles() {
        proxy.sendFile();
    }

    @Override
    public void submitData(String data) {

        //TODO 使用factory生成id和对应数据
        DataSubmission ds = new DataSubmission(SubmissionId.generateUUID(), new Date(), data);
        aggregate.addSubmission(ds);
        aggregate.processSubmissions(); //自动抛出异常

        //TODO call proxy south-api
        proxy.sendData(ds);

    }
}
