package com.bond.domain.model.datasource.repository;

import com.bond.domain.model.gateway.types.ReportNode;
import com.bond.domain.model.gateway.types.field.EscrowAccountField;
import com.bond.domain.model.gateway.types.field.OpenAccDateField;
import com.bond.domain.model.gateway.types.nodes.OpenAccNode;

import java.util.ArrayList;
import java.util.Date;

//repo层
public class OpenAccRepo extends  BaseRepo{

    public ArrayList<ReportNode> getNodes(Date date) {
        //TODO 根据日期参数，去库表查询开户记录，并转为节点对象
        EscrowAccountField mdea = new EscrowAccountField();
        OpenAccDateField mdoad = new OpenAccDateField(new Date()); //数据库节点查到的开户日期
        ReportNode node  = new OpenAccNode(mdoad, mdea);
        return null;
    }
}
