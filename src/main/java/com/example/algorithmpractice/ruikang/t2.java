package com.example.algorithmpractice.ruikang;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/7/15 14:15
 */

public class t2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        //评级初始化
        HashMap<String,String> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String[] strArr = str.split(" ");
            map.put(strArr[0],strArr[1]);
        }
        Set<String> keys = map.keySet();
        //检测
        for (int i = 0; i < m; i++) {
            String str = sc.nextLine();
            if(keys.contains(str)){
                System.out.println(map.get(str));
                continue;
            }
            String dingji = dingji(str, map);
            System.out.println(dingji);
        }

    }


    public static String dingji(String str,HashMap<String,String> map){
        //判断是不是以指定前缀开始
        //f表示第一次拆解的方案数
        Set<String> keys = map.keySet();
        int f=0;
        String res="";
        while (str.length()>0) {
            String theKey="";
            for (String key:keys){
                if(str.startsWith(key)){
                    theKey=key;
                    f++;
                }
            }
            if(f==0 || f>1){
                return "D";
            }else {
                String ji = map.get(theKey);
                res+=ji;
            }
            int oldLen=str.length();
            str=str.substring(theKey.length(),oldLen);
            f=0;
        }
        return res;
    }

//    1 1
//    qwe qwe
}
// AAABBB




//3 3
//        aa A
//        bb B
//        aabb C
//        qwe
//        D
//        asd
//        D
//        aabb
//        D
//  a c  ac              a  ac  cb                        acb

