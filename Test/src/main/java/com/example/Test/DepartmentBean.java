package com.example.Test;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String departmentName;

    public DepartmentBean() {
        this.departmentName = "Computer Science"; // default department
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
