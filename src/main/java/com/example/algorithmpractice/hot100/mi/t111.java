package com.example.algorithmpractice.hot100.mi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/3/12 19:32
 */
public class t111 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String charStr = sc.nextLine();
        String str = sc.nextLine();
        char[] loveChars=new char[m];
        for (int i = 0; i < m; i++) {
            loveChars[i]=charStr.charAt(i*2);
        }
        char[] repChars=str.toCharArray();
        char[] ans=new char[n];
        //设置在不在的数组
//        boolean[] zaibuzai =new boolean[n];
//        for (int i = 0; i < n; i++) {
//            zaibuzai[i]=haveChar(loveChars,repChars[i]);
//        }
        Set<Character> set=new HashSet<>();
        for (int i = 0; i < m; i++) {
            set.add(loveChars[i]);
        }
        //
        for (int i = 0; i < n; i++) {
            if ( !set.contains( repChars[i] ) ){
                int cn=1;
                while (true){
                    int left=i-cn,right=i+cn;
                    if ((left >= 0) ){
                        if ( set.contains( repChars[left] ) ) {
                            ans[i]=repChars[left];
                            break;
                        }
                    }
                    if(right<=(n-1) ){
                        if (set.contains( repChars[right] )) {
                            ans[i]=repChars[right];
                            break;
                        }
                    }
                    cn++;
                }
            }else {
                ans[i]=repChars[i];
            }

        }
        String ansStr=new String(ans);
        System.out.println(ansStr);

    }

//    public static  boolean haveChar( char[] chars,char ch){
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i]==ch){
//                return true;
//            }
//        }
//        return false;
//    }


}
