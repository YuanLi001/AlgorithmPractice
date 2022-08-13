package com.example.algorithmpractice.specialbreakthrough.third;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/13 7:42
 */
public class t034 {

    Map<Character,Integer> orderMap=new HashMap<>();

    public boolean isAlienSorted(String[] words, String order) {
        mapInitialize(order);
        for (int i = 1; i <= words.length-1; i++) {
            for (int j = 0; j <= words.length-1-i; j++) {
                String s1 = words[j];
                String s2 = words[j + 1];
                int compare = compare(s1, s2);
                String s3;
                if(compare==1){
                    return false;
                }
            }
        }
        return true;
    }

    public void mapInitialize(String order){
        for (int i = 0; i < order.length(); i++) {
            orderMap.put( order.charAt(i),i );
        }
    }

    //s1>s2-->1, s1==s2 0 , s1<s2-->-1
    public int compare(String s1,String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        int i=0;
        while (i<len1 && i<len2){
            Integer o1 = orderMap.get(s1.charAt(i));
            Integer o2 = orderMap.get(s2.charAt(i));
            if(o1<o2){
                return -1;
            }else if(o1>o2){
                return 1;
            }
            i++;
        }
        if(len1==len2){
            return 0;
        }else if(len1<len2){
            return -1;
        }else {
            return 1;
        }
    }

//    public void swap(String s1,String s2){
//        String s3=s1;
//        s1=s2;
//        s2=s3;
//    }

}
