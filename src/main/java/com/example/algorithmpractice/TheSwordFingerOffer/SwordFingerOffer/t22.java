package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/19 9:07
 */
public class t22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode theHead=head;
        List<ListNode> arrayList=new ArrayList<>();
        while (theHead!=null){
            arrayList.add(theHead);
            theHead=theHead.next;
        }
        int len=arrayList.size();
        return arrayList.get(len-k);
    }
}
