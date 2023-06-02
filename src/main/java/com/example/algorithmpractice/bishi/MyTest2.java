package com.example.algorithmpractice.bishi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/4/11 10:33
 */
public class MyTest2 {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("qwe1",1,111));
        list.add(new Student("qwe1",1,22));
        list.add(new Student("qwe2",1,33));
        list.add(new Student("qwe3",1,44));
        list.stream().forEach(student -> {
            student.setAge(100);
            student.setScore(200);
        });
        for(Student s:list){
            System.out.println(s);
        }
    }
}
