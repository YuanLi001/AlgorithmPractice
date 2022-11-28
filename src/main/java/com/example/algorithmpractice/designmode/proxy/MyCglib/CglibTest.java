package com.example.algorithmpractice.designmode.proxy.MyCglib;

import com.example.algorithmpractice.designmode.proxy.MyStatic.Person;
import com.example.algorithmpractice.designmode.proxy.MyStatic.Student;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/11/28 11:16
 */
public class CglibTest {
    public static void main(String[] args) {
        NoInterfaceStudent proxy =(NoInterfaceStudent) CglibProxyFactory.getProxy(NoInterfaceStudent.class);
        proxy.giveMoney();
    }
}
