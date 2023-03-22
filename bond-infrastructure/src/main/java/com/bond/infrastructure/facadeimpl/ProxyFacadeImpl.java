package com.bond.infrastructure.facadeimpl;

import com.bond.domain.model.proxy.services.SouthApiService;
import com.bond.domain.model.report.ability.facade.ProxyFacade;
import com.bond.domain.model.report.aggregate.DataSubmissionAggregate;
import com.bond.domain.model.report.entity.DataSubmission;
import org.springframework.beans.factory.annotation.Autowired;

public class ProxyFacadeImpl implements ProxyFacade {
    @Autowired
    SouthApiService southApiService;

    @Override
    public void sendData(DataSubmission ds) {
        southApiService.sendData(ds.getSubmissionData());
    }

    @Override
    public void sendFile() {
        southApiService.readyForFile();

    }


}
