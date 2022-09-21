package com.example.algorithmpractice.specialbreakthrough.six;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/21 13:43
 */

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head=new ListNode();
        ListNode tail=head;
        List<ListNode> arraylist=new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            if(lists[i] !=null) arraylist.add(lists[i]);
        }
        while (arraylist.size()!=0){
            int minIndex=0;
            for (int i = 1; i < arraylist.size(); i++) {
                if( arraylist.get(minIndex).val > arraylist.get(i).val ) minIndex=i;
            }
            tail.next=new ListNode();
            tail=tail.next;
            tail.val=arraylist.get(minIndex).val;
            ListNode next = arraylist.get(minIndex).next;
            if(next==null){
                arraylist.remove(minIndex);
            }else {
                arraylist.set(minIndex,next );
            }
        }
        return head.next;
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
