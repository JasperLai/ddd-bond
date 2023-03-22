package com.bond.domain.model.report.entity;

import com.alibaba.fastjson.JSONObject;
import com.bond.domain.model.report.types.SubmissionId;

import java.util.Date;


//对应一个文件，或者一条实时数据报文提交
//日终提交多个文件，则会有多个submission在聚合根中
public class DataSubmission {

    private String submissionId;
    private Date submissionTime;

    private String submissionData;


    public DataSubmission(String id, Date time, String data) {
        submissionId = id;
        submissionTime = time;
        submissionData = data;
    }

    public String getSubmissionData() {
        return submissionData;
    }

    public boolean validateSubmissionData() {
        // 数据验证逻辑
        return true;
    }


}

