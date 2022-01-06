package com.day01.demo1;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Major m  = new Major("计算机", (long) 666666);
        Student student1 = new Student("cuixiaotu",18,m);


        Student student2 = (Student) student1.clone();

        System.out.println( student1 == student2);
        System.out.println(student1);
        System.out.println(student2);

        student1.setAge(24);

        m.setMajorId(888888);

        m.setMajorName("电子信息");

        System.out.println(student1);
        System.out.println(student2);
    }



}