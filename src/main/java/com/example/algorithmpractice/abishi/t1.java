package com.example.algorithmpractice.abishi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/4/11 14:41
 */
public class t1 {

    public ListNode detectCycle(ListNode head) {
//        Lock
//        Map<ListNode,Integer> map=new HashMap();
        Set<ListNode> set=new HashSet<>();
        while(head!=null){

            if(set.contains(head)){
                return head;
            }else {
                set.add(head);
            }
        }
        return null;
    }
}

  class ListNode {
      int val;
     ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
