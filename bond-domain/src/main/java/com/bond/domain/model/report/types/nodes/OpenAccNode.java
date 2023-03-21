package com.bond.domain.model.report.types.nodes;

import com.bond.domain.model.report.types.ReportNode;
import com.bond.domain.model.report.types.field.EscrowAccountField;
import com.bond.domain.model.report.types.field.OpenAccDateField;

public class OpenAccNode extends ReportNode {
    OpenAccDateField openAccDate;
    EscrowAccountField escrowAccount;

    public OpenAccNode(OpenAccDateField openAccDate, EscrowAccountField escrowAccount){
        this.openAccDate = openAccDate;
        this.escrowAccount = escrowAccount;
    }

    public String toString(){
        //将元数据按要求组成string
        String s =  openAccDate.format()+escrowAccount.format();
        return s;
    }
}
