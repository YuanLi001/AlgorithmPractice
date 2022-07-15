package com.example.algorithmpractice.jvm;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/16 18:53
 */
public class t1 {
    public static void main(String[] args) {
        String str1 = "str";
        String str2 = "ing";
        String str3 = "str" + "ing";//常量池中的对象
        String str4 = str1 + str2; //在堆上创建的新的对象
        String str5 = "string";//常量池中的对象
        System.out.println(str3 == str4);//false
        System.out.println(str3 == str5);//true
        System.out.println(str4 == str5);//false
        Integer.valueOf(2);

    }
}
