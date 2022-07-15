package com.example.algorithmpractice.specialbreakthrough.first;

import java.util.Arrays;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/5/8 12:57
 */
public class t002 {
    public static String addBinary(String a, String b) {
        if (a.charAt(0) == '0') {
            return b;
        }
        if (b.charAt(0) == '0') {
            return a;
        }
        int alen = a.length();
        int blen = b.length();
        int max = alen > blen ? alen : blen;
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        char[] addAB=new char[max+1];
        alen--;
        blen--;
        int tail=max;
        boolean f=false;
        for (int i = 0; i <= max; i++) {
            addAB[i]='0';
        }
        while (alen>=0 && blen>=0){
            if( charsA[alen]=='1' && charsB[blen]=='1' ){
                addAB[tail-1]='1';
            }else if( charsA[alen]!='0' || charsB[blen]!='0' ){
                if( addAB[tail]=='0' ){
                    addAB[tail]='1';
                }else{
                    addAB[tail-1]='1';
                    addAB[tail]='0';
                }
            }
//            System.out.println(tail+":"+ addAB[tail]);
            alen--;
            blen--;
            tail--;
        }
        while (alen>=0){
            if(addAB[tail]=='0' ){
                addAB[tail]=charsA[alen];
            }else{
                if(charsA[alen]=='1'){
                    addAB[tail-1]='1';
                    addAB[tail]='0';
                }
            }
            alen--;
            tail--;
        }
        while (blen>=0){
            if(addAB[tail]=='0' ){
                addAB[tail]=charsB[blen];
            }else{
                if(charsB[blen]=='1'){
                    addAB[tail-1]='1';
                    addAB[tail]='0';
                }
            }
            blen--;
            tail--;
        }
        //判断tail是否为0
        if(addAB[0]=='0'){
            addAB= Arrays.copyOfRange( addAB,1, max+1);
        }
        return String.valueOf(addAB);

    }

    public static void main(String[] args) {
        String s = addBinary("11", "10");
        System.out.println(s);
    }
}
