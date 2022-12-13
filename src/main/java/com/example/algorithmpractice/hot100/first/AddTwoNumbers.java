package com.example.algorithmpractice.hot100.first;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/12/13 20:43
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2= l2 !=null? l2.val:0;
            int num=n1+n2+carry;
            if(head==null){
                tail=new ListNode( num%10 );
                head=tail;
            }else {
                tail.next=new ListNode(num%10);
                tail=tail.next;
            }
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
            carry=num/10;
        }
        if(carry>0){
            tail.next=new ListNode(carry);
        }
        return head;
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
