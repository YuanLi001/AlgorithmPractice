package com.example.algorithmpractice.foroffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/10 15:15
 */
public class t1 {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(111,222);
        Object o=new Object();
//        Student s=new Student();
//        System.out.println( 5&3);
        String s="123";
        System.out.println(s.hashCode());
        Student student=new Student();
        System.out.println(student.hashCode());

    }

}
