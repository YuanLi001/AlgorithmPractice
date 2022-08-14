package com.example.algorithmpractice.specialbreakthrough.third;

import java.util.ArrayList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/14 11:43
 */
public class t0003 {
    public String smallestNumber(String pattern) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        int p=1;
        String res="";
        for (int i = 0; i < pattern.length(); i++) {
            if(pattern.charAt(i)=='I'){
                res+=arrayList.get(0);
                arrayList.remove(0);
            }else{
                    int dLen = getDLen(pattern, i);
                    res+=arrayList.get(dLen);
                    arrayList.remove(dLen);
            }
        }
        return res+arrayList.get(0);
    }

    public int getDLen(String s,int begen){
        int cn=0;
        while (begen<s.length() && s.charAt(begen)=='D'){
            cn++;
            begen++;
        }
        return cn;
    }
}
