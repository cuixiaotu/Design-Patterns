package com.day01.demo1;

public class CloneTest implements Cloneable {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public CloneTest(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    protected CloneTest clone() throws CloneNotSupportedException {
        return (CloneTest)super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest cloneTest = new CloneTest(23,"xx");
        CloneTest clone = cloneTest.clone();

        System.out.println(clone == cloneTest);
        System.out.println(cloneTest.getAge() == clone.getAge());
        System.out.println(cloneTest.getName() == clone.getName() );

    }
}
