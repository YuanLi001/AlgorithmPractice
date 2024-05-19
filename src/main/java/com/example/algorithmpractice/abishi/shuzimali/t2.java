package com.example.algorithmpractice.abishi.shuzimali;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/4/15 20:19
 */
public class t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr=new int[n];
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            int oldV=map.getOrDefault(arr[i],0);
            map.put(arr[i],oldV+1);
        }
        Set<Integer> keys = map.keySet();
        int maxcn=0;
        for(Integer key:keys){
            if(key<=m){
                maxcn=Math.max(maxcn,map.get(key));
            }
        }
        System.out.println(maxcn);
    }
}
