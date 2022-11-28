package com.example.algorithmpractice.designmode.proxy.MyStatic;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/11/27 17:33
 */
//学生代理类，也实现了Person接口，保存一个学生实体，这样既可以代理学生产生行为
public class StudentsProxy implements Person{
    //被代理的学生
    Student stu;

    public StudentsProxy(Person stu) {
        // 只代理学生对象
        this.stu = (Student)stu;
    }

    //代理上交班费，调用被代理学生的上交班费行为
    @Override
    public void giveMoney() {
        System.out.println("交之前做的事");
        stu.giveMoney();
        System.out.println("交之后做的事");
    }
}