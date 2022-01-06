package com.day01.demo1;

import java.io.Serializable;

public class Major implements Serializable {
    private String majorName; // 专业名称
    private long majorId;     // 专业代号

    public Major(String name,Long id){
        majorId = id;
        majorName = name;
    }

    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/



    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public void setMajorId(long majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public long getMajorId() {
        return majorId;
    }
}
