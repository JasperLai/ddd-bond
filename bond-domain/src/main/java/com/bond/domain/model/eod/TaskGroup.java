package com.bond.domain.model.eod;

import java.util.List;

public class TaskGroup {

    public String groupId;
    public List<Task> tasks;

    public List<Task> getGroupTasksInOrder(){
        return tasks;
    }

}
