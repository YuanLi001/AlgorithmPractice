package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_I;

import java.util.LinkedList;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/9 9:02
 */
public class t62 {
    public int lastRemaining(int n, int m) {
        LinkedList<Integer> list=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int cn=1;
        while ( list.size()!=1){
            if(cn%m==0){
                Integer remove = list.remove();
            }else{
                Integer remove = list.remove();
                list.add(remove);
            }
            cn++;
        }
        return list.getFirst();
    }
}
