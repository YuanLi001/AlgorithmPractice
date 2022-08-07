package com.example.algorithmpractice.specialbreakthrough.second;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/7 16:11
 */
public class t015 {
    public static List<Integer> findAnagrams(String s, String p) {
        int slen=s.length(),plen=p.length();
        List<Integer> list=new ArrayList<>();
        if(plen>slen){
            return list;
        }
        int[] counter=new int[26];
        for (int i = 0; i < plen; i++) {
            counter[ p.charAt(i)-'a' ]--;
            counter[ s.charAt(i)-'a' ]++;
        }
        int diff=0;

        for(int num:counter){
            if(num!=0){
                diff++;
            }
        }
        if(diff==0){
            list.add(0);
        }
        int x,y;
        for (int i = 0; i <slen-plen ; i++) {

            x=s.charAt(i)-'a';
            y=s.charAt(i+plen)-'a';
            if(x!=y){
                if(counter[x]==0){
                    diff++;
                }
                counter[x]--;
                if(counter[x]==0){
                    diff--;
                }
                if(counter[y]==0){
                    diff++;
                }
                counter[y]++;
                if(counter[y]==0){
                    diff--;
                }
            }

            if(diff==0){
                list.add(i+1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> anagrams = findAnagrams("cbaebabacd", "abc");
        System.out.println(anagrams);
    }
}
