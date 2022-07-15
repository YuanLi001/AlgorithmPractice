package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_LinkedList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/2 11:39
 */
public class t4 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList=new ListNode();
        ListNode tail=newList;
        while (list1!=null && list2!=null){
            if(list1.val< list2.val){
                tail.next=list1;
                tail=tail.next;
                list1=list1.next;
            }else{
                tail.next=list2;
                tail=tail.next;
                list2=list2.next;
            }
        }
        if(list1!=null){
            tail.next=list1;
        }else{
            tail.next=list2;
        }
        return newList.next;
    }
}
