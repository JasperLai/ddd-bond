package com.bond.domain.model.datasource.repository;

import com.bond.domain.model.gateway.types.ReportNode;

import java.util.ArrayList;
import java.util.Date;

public abstract class BaseRepo {
    abstract public ArrayList<ReportNode> getNodes(Date date);
}
