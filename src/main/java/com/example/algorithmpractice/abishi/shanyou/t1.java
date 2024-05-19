package com.example.algorithmpractice.abishi.shanyou;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class t1 {

    private static Map<String,Integer> map=new HashMap<>();

    public static void main(String[] args) {
        map.put("3",0);
        map.put("4",1);
        map.put("5",2);
        map.put("6",3);
        map.put("7",4);
        map.put("8",5);
        map.put("9",6);
        map.put("10",7);
        map.put("J",8);
        map.put("Q",9);
        map.put("K",10);
        map.put("A",11);
        map.put("2",12);
        String[] pai={"9","10","J","Q","K"};
        System.out.println(isShunzi(pai));
    }

    public static boolean isShunzi(String[] pai){
        int[] ranks=new int[pai.length];
        for (int i = 0; i < pai.length; i++) {
            ranks[i]=map.get(pai[i]);
        }
        Arrays.sort(ranks);
        for (int i = 0; i < ranks.length-1; i++) {
            if(ranks[i+1]-ranks[i]!=1){
                return false;
            }
        }
        return true;
    }
}
