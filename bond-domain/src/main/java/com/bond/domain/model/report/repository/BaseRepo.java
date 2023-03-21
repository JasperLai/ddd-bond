package com.bond.domain.model.report.repository;

import com.bond.domain.model.report.types.ReportNode;

import java.util.ArrayList;
import java.util.Date;

public abstract class BaseRepo {
    abstract public ArrayList<ReportNode> getNodes(Date date);
}
