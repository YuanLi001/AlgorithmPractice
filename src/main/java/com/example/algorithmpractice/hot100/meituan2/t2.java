package com.example.algorithmpractice.hot100.meituan2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/18 10:41
 */
public class t2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int maxlen=0;
        for (int i = 0; i < n; i++) {
            int cn=0;
            for (int j = i; j < n; j++) {
                if(!set.contains( arr[j] )){
                    set.add(arr[j]);
                    if(set.size()>k){
                        set.clear();
                        break;
                    }
                }
                cn++;
            }
            maxlen=Math.max(maxlen,cn);
        }
        System.out.println(maxlen);
    }
}
