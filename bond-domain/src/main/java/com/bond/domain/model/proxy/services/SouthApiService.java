package com.bond.domain.model.proxy.services;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bond.domain.model.report.ability.services.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class SouthApiService {
    @Autowired
    DataSourceService dataSource;
    public void readyForFile(){
        ArrayList<String> all = dataSource.getAllFileInfo();
        //这里组装文件
        for(String a : all){
            JSONObject json = JSONObject.parseObject(a);
        }
    }
    public void sendData(String s){

    }
}
