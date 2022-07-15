package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_LinkedList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/1 19:56
 */
public class t2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cn=0;
        ListNode newHead=head;
        while (head!=null){
            head=head.next;
            cn++;
        }
        if( cn==1 && n==1){
            return null;
        }else if( cn>1 && n==cn){
            return newHead.next;
        }else{
            int cn2=0;
            head=newHead;
            while (head!=null){
                cn2++;
                if( (cn2+n)==cn){
                    head.next=head.next.next;
                    break;
                }
                head=head.next;
            }
        }
        return newHead;
    }
}

//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}
