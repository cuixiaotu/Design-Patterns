package com.day01.demo1;

import java.io.*;

public class Student implements Serializable {

    private String name;  // 姓名
    private int age;      // 年龄
    private Major major;  // 所学专业

/*
    @Override
    public Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.major = (Major) major.clone();
        return student;
    }
*/

    public Student clone(){
        try {
            //将对象本身序列化为字节流
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            //字节流反序列化得到对象副本
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            return (Student)objectInputStream.readObject();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }


    public Student(String n, int a,Major m ){
        name = n;
        age = a;
        major = m;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", majorId=" + major.getMajorId() +
                ", majorName=" + major.getMajorName() +
                '}';
    }
}