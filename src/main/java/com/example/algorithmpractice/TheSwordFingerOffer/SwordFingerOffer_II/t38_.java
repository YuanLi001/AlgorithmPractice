package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_II;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/14 20:43
 */
public class t38_ {
    List<String> res = new LinkedList<>();
    char[] c;
    public String[] permutation(String s) {
        c=s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size() ]);
    }

    void dfs(int x){
        if(x==c.length-1){
            res.add( String.valueOf(c));
            return;
        }
        HashSet<Character> set=new HashSet<>();
        for (int i = x; i <c.length-1; i++) {
            if(set.contains( c[i] )){
                //在这一层中发现重复元素，直接跳过
                continue;
            }
            set.add(c[i] );
            //不断改变当前位置的元素
            swap( x,i );
            //更改后再次递归
            dfs(x+1);
            //更改后要把位置调换过来
            swap(x,i);
        }
    }

    void swap(int a,int b){
        char temp=c[a];
        c[a]=c[b];
        c[b]=temp;
    }
}
