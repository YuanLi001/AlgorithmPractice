package com.example.algorithmpractice.abishi.jianxin;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/4/20 20:01
 */
public class t2 {
    public ListNode mergeNode (ListNode head) {
        // write code here
        if(head==null){
            return head;
        }
        ListNode pre=head;
        ListNode theNext=head.next;
        while (theNext!=null){
            if( (theNext.val)%2==0 && (pre.val%2)==1){
                pre.val+= theNext.val;
                pre.next=theNext.next;
//                pre=pre.next;
//                theNext=
                theNext=theNext.next;
            }else {
                pre=theNext;
                theNext=theNext.next;
            }

        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
      this.val = val;
    }
  }
