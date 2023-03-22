package com.bond.domain.model.report.aggregate;

import com.bond.domain.model.report.entity.DataSubmission;

import java.util.ArrayList;
import java.util.List;

public class DataSubmissionAggregate {
    private List<DataSubmission> submissions = new ArrayList<>();

    public void addSubmission(DataSubmission submission) {
        submissions.add(submission);
    }
    public ArrayList<String> getData(){
        ArrayList<String> list = new ArrayList<>();
        for (DataSubmission submission : submissions) {
            list.add(submission.getSubmissionData());
        }
        return list;
    }

    public void processSubmissions() {
        for (DataSubmission submission : submissions) {
            if (submission.validateSubmissionData()) {
                // 数据处理逻辑
            } else {
                // 数据验证失败处理逻辑
                // throw exception
            }
        }
    }
}

