package com.example.algorithmpractice.hot100.tenxun;

import java.util.*;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/26 20:22
 */
public class t2 {
    static Set<String> ans=new HashSet<>();

    static Deque<String> stack=new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] strs=new String[n];
        for (int i = 0; i < n; i++) {
            strs[i]=sc.nextLine();
        }
        huisu(strs,0);
//        for (int i = 0; i < ans.size(); i++) {
////            System.out.println(ans.);
//        }
        System.out.println(ans.size());
    }

    public static void huisu(String[] strs,int pos){
        if(pos== strs.length){
            if(stack.size()==pos){
                ans.add( stack.toString() );
            }
            return;
        }
        String s=strs[pos];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(!stack.contains( chars[i]+"" )){
                stack.addLast(chars[i]+"");
                huisu(strs, pos+1);
                stack.removeLast();
            }
        }
    }
}

//for (int i = 0; i < n; i++) {
//        System.out.println(strs[i]);
//        }
