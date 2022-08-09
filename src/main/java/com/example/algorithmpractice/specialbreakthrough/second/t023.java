package com.example.algorithmpractice.specialbreakthrough.second;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/9 9:19
 */
public class t023 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode pA=headA,pB=headB;
        while (pA!=pB){
            pA= pA==null? headB:pA.next;
            pB= pB==null? headA:pB.next;
        }
        return pA;
    }
}
