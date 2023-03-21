package com.bond.domain.model.report.types;

//报送节点数据，可以定义一个字符串，也可以是一个XML块，或者一个Json串
public abstract class ReportNode {

    public String toString(){
        return "";
    };
    public String toXml(){
        return "";
    };
    public String toJson(){
        return "";
    };


}
