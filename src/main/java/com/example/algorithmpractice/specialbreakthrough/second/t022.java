package com.example.algorithmpractice.specialbreakthrough.second;

//import com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer.ListNode;

import java.util.HashSet;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/8 15:40
 */
public class t022 {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set=new HashSet<>();
        while (head!=null){
            if(set.contains(head)){
                return head;
            }
            set.add(head);
            head=head.next;
        }
        return null;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(){

    }
    ListNode(int x) {
        val = x;
        next = null;
    }
}
