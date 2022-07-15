package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/19 8:56
 */
public class t18 {

    public ListNode deleteNode(ListNode head, int val) {
        if(head.val==val){
            ListNode newHead=new ListNode(val);
            newHead.next=head.next;
            return newHead;
        }else{
            ListNode pre;
            while (head!=null){
                pre=head;
                head=head.next;
                if(head.val==val){
                    pre.next=head.next;
                    break;
                }
            }

        }
        return head;
    }
}
