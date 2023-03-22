package com.bond.domain.model.report.ability.facade;

import com.bond.domain.model.report.aggregate.DataSubmissionAggregate;
import com.bond.domain.model.report.entity.DataSubmission;

import javax.xml.crypto.Data;

public interface ProxyFacade {
    void sendData(DataSubmission ds);
    void sendFile();

}
