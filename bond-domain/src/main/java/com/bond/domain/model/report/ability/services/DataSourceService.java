package com.bond.domain.model.report.ability.services;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;

public interface DataSourceService {

    ArrayList<String> getAllFileInfo();

    String getSalesInfo(String bondID);
    void setTransferData();
}
