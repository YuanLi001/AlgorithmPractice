package com.example.algorithmpractice.bishi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/5/25 14:17
 */
public class testNum {
    public static void main(String[] args) {
//        List<Integer> numbers = List.of(1, 1, 1, 1, 1);
        List<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
//        int frequency = Collections.frequency(numbers, 3);
//        System.out.println(frequency);
        for (Integer n:numbers){
            System.out.println(n);
        }
        System.out.println("==============");
        numbers = numbers.stream().filter(f -> f > 1).collect(Collectors.toList());
        for (Integer n:numbers){
            System.out.println(n);
        }
    }
}
