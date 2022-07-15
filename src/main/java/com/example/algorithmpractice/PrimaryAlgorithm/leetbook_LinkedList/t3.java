package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_LinkedList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/2 11:18
 */
public class t3 {
    public ListNode reverseList(ListNode head) {
        ListNode temp,oldHead = null;
        int f=0;
        while (head!=null){
            if(f == 0){
                f=1;
                temp=head.next;
                oldHead=head;
                head.next=null;
                head=temp;
            }else{
                temp=head.next;
                head.next=oldHead;
                oldHead=head;
                head=temp;
            }


        }
        return oldHead;
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
