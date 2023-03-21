package com.bond.domain.model.report.types;

import com.bond.domain.model.report.types.ReportNode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

//DOMAIN OBJECT
public class Report {
    private List<ReportNode> nodes; //节点数据
    private String reportFileName = null;  //文件名称
    private String  charset = null;

    public Report(int messageFormat, int reportType) {

    }

    public String getFileName() {
        return reportFileName;
    }

    public void setFileName(String fileName) {
        this.reportFileName = fileName;
    }

    public List<ReportNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<ReportNode> nodes) {
        this.nodes = nodes;
    }


}
