package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/19 9:46
 */
public class t52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set=new HashSet<>();
        while (headA!=null){
            set.add(headA);
            headA=headA.next;
        }
        while (headB!=null){
            if(set.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
}
