package com.bond.domain.model.report.types;

//元数据，组成节点的数据单元
public interface ReportField {

    public int length = 0; //长度
    public String format();
}
