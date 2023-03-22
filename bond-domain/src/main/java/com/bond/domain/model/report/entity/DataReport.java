package com.bond.domain.model.report.entity;

import java.util.Date;

public class DataReport {

    private String reportId;
    private Date submissionTime;
    private String submissionData;


    public DataReport(String id, Date time, String data) {
        reportId = id;
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

