package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_LinkedList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/2 11:50
 */
public class t5 {
    public static boolean isPalindrome(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //将反转后的和原链表一一对应
        while (head!=null){
            if(head.val!= prev.val){
                return false;
            }
            head=head.next;
            prev=prev.next;
        }
        return true;

    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(1,null))));
        boolean palindrome = isPalindrome(head);
        System.out.println(palindrome);
    }
}
