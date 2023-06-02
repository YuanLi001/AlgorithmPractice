package com.example.algorithmpractice.bishi;

import org.springframework.beans.BeanUtils;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/21 10:25
 */
public class test2 {
    public static void main(String[] args) {
        Student2 student2=new Student2("张三",11,11,"计科");
        Student student=new Student();
        BeanUtils.copyProperties(student2,student);
        System.out.println("student:"+student);
        System.out.println("student2:"+student2);
        BeanUtils.copyProperties(student,student2);
        System.out.println("=============");
        System.out.println("student:"+student);
        System.out.println("student2:"+student2);

        Student student3=new Student();
        BeanUtils.copyProperties(student3,student2);
        System.out.println("==============");
        System.out.println("student3:"+student3);
        System.out.println("student2:"+student2);
    }
}
