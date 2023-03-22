package com.bond.domain.model.report.ability.services;

import com.bond.domain.model.report.entity.DataSubmission;
import com.bond.domain.model.report.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class DataSourceServiceImpl implements DataSourceService{


    @Autowired
    DataRepository repo;

    @Override
    public String getSalesInfo(String bondId) {
        return repo.findSalesData(bondId);
    }
    @Override
    public ArrayList<String> getAllFileInfo() {
        DataSubmission openAccDS =  repo.findOpenAccountInfo();
        DataSubmission allInfoDS =  repo.findAllInfo();

        //convert to Arraylist,每一条都是一个json Array

        return null;
    }

    @Override
    public void setTransferData() {

    }
}
