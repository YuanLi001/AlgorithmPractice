//package com.example.algorithmpractice.hot100.second;
//
//import com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer.ListNode;
//
///**
// * @author YuanLi
// * @version 1.0
// * @date 2023/3/3 23:19
// */
//public class t_19 {
////    public ListNode removeNthFromEnd(ListNode head, int n) {
////        ListNode dummy = new ListNode(0, head);
////        ListNode first = head;
////        ListNode second = dummy;
////        for (int i = 0; i < n; ++i) {
////            first = first.next;
////        }
////        while (first != null) {
////            first = first.next;
////            second = second.next;
////        }
////        second.next = second.next.next;
////        ListNode ans = dummy.next;
////        return ans;
////    }
//    public ListNode removeNthFromEnd(ListNode head, int n){
//        ListNode dummy = new ListNode(0, head);
//        ListNode first=head;
//        ListNode second=dummy;
//        for (int i = 0; i < n; i++) {
//            first=first.next;
//        }
//        while (first!=null){
//            first=first.next;
//            second=second.next;
//        }
//        second.next = second.next.next;
//        ListNode ans = dummy.next;
//        return ans;
//    }
//}
//
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
