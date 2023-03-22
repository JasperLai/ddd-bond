package com.bond.domain.model.proxy.entity;

import com.bond.domain.model.proxy.types.ReportNode;

import java.util.List;

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
