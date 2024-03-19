package com.example.algorithmpractice.hot100.yunzhi;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/3/18 21:43
 */
public class t3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int res=countStr(s);
        System.out.println(res);
    }

    public static int countStr(String s){
        int count=0;
        int rcount=0;
        int ecount=0;
        for(char c:s.toCharArray()){
            if(c=='r'){
                rcount++;
            }else if(c=='e'){
                ecount++;
            }else if(c=='d'){
                rcount++;
                ecount++;
            }else {
                if(rcount>0&&ecount>0){
                    count++;
                }
                rcount=0;
                ecount=0;
            }
        }
        if(rcount>0&&ecount>0){
            count++;
        }
        return count;
    }
}
