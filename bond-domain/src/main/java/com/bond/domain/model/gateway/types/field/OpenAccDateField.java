package com.bond.domain.model.gateway.types.field;

import com.bond.domain.model.gateway.types.ReportField;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OpenAccDateField implements ReportField {

    private Date openAccDate;
    private int length = 1;  //参照文档定义长度
    public OpenAccDateField(Date d){
        openAccDate = d;
    }


    @Override
    public String format() {
        //根据报送文件定义的规则，补全长度
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String s = simpleDateFormat.format(openAccDate); //格式化日期
        String format = "%0"+ length +"d"; //"%06d"
        return String.format(format,s); //格式化输出
    }
}
