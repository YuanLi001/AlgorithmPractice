package com.example.algorithmpractice.specialbreakthrough.second;

import java.util.ArrayList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/10 7:33
 */
public class t026 {
    public void reorderList(ListNode head) {
        /* 0 0
           2 1
           4 2
           6 3
         */
        /*  1  n
            3  n-1
            5  n-2
         */
        ArrayList<ListNode> list=new ArrayList<>();
        ListNode newHead=head;
        while (newHead!=null){
            list.add(newHead);
            newHead=newHead.next;
        }
        int n=list.size()-1;
        for (int i = 1; i < list.size(); i++) {
            if(i%2==0){
                head.next=list.get(i/2);
            }else{
                head.next=list.get( n-(i-1)/2 );
            }
            head=head.next;
        }
        head.next=null;
    }
}
