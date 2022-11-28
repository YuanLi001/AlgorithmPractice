package com.example.algorithmpractice.designmode.proxy.MyStatic;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/11/27 17:32
 */
public class Student implements Person {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        System.out.println(name + "上交班费50元");
    }
}
