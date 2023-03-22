package com.bond.domain.model.report.ability.facade;

import com.bond.domain.model.report.entity.DataReport;


public interface ProxyFacade {
    void sendData(DataReport ds);
    void sendFile();

}
