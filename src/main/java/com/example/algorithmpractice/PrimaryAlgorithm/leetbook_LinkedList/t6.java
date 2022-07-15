package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_LinkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/3 13:30
 */
public class t6 {
    public boolean hasCycle(ListNode head){
        Set<ListNode> seen=new HashSet<>();
        while (head!=null){
            boolean res = seen.add(head);
            if(res==false){
                return true;
            }
            head=head.next;
        }
        return false;
    }
}
