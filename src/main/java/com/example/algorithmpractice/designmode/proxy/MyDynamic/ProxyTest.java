package com.example.algorithmpractice.designmode.proxy.MyDynamic;

import com.example.algorithmpractice.designmode.proxy.MyStatic.Person;
import com.example.algorithmpractice.designmode.proxy.MyStatic.Student;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/11/28 9:57
 */
public class ProxyTest {
    public static void main(String[] args) {

        //创建一个实例对象，这个对象是被代理的对象
        Person stu = new Student("张三");

        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler stuHandler = new StuInvocationHandler(stu);

        //创建一个代理对象stuProxy来代理zhangsan，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        Person stuProxy = (Person) Proxy.newProxyInstance(stu.getClass().getClassLoader(), stu.getClass().getInterfaces(), stuHandler);

        //代理执行上交班费的方法
        stuProxy.giveMoney();
    }
}
