package com.example.algorithmpractice.bishi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/4/10 16:50
 */
public class MyTest {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("qwe1",1,111));
        list.add(new Student("qwe1",1,22));
        list.add(new Student("qwe2",1,33));
        list.add(new Student("qwe3",1,44));
//        Map<String, Integer> collect = list.stream().distinct().collect(Collectors.toMap(Student::getName, Student::getScore), (v1, v2) -> v1);
        Map<String, Integer> collect = list.stream().distinct().collect(Collectors.toMap(Student::getName, Student::getScore, (v1, v2) -> v1) );
//        Map<String, Integer> collect = list.stream().distinct().collect(Collectors.toMap(Student::getName, Student::getScore));
//        Map<String, Integer> collect = list.stream().distinct().collect(Collectors.toMap(Student::getName, Student::getAge));
        Set<Map.Entry<String, Integer>> entries = collect.entrySet();
        for(Map.Entry<String, Integer> entry:entries ){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
