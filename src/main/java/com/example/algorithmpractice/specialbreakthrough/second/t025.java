package com.example.algorithmpractice.specialbreakthrough.second;

import java.util.ArrayList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/9 9:29
 */
public class t025 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int[] arrOne = new int[100], arrTwo = new int[100];
        ListNode p1 = l1, p2 = l2;
        int len1 = 0, len2 = 0;
        while (p1 != null) {
            arrOne[len1] = p1.val;
            len1++;
            p1 = p1.next;
        }
        while (p2 != null) {
            arrTwo[len2] = p2.val;
            len2++;
            p2 = p2.next;
        }
        int newLen = Math.max(len1, len2) + 1;
        int[] newArr = new int[newLen];
        int tail1 = len1 - 1, tail2 = len2 - 1,newTail=newLen-1;
        while (tail1>-1 && tail2>-1){
            int num=arrOne[tail1]+arrTwo[tail2]+newArr[newTail];
            if(num>=10){
                newArr[newTail]=(num-10);
                newArr[newTail-1]+=1;
            }else{
                newArr[newTail]=num;
            }
            tail1--;
            tail2--;
            newTail--;
        }
        while (tail1>-1){
            int num=arrOne[tail1]+newArr[newTail];
            if(num>10){
                newArr[newTail]=(num-10);
                newArr[newTail-1]+=1;
            }else {
                newArr[newTail]=num;
            }
            tail1--;
            newTail--;
        }
        while (tail2>-1){
            int num=arrTwo[tail2]+newArr[newTail];
            if(num>10){
                newArr[newTail]=(num-10);
                newArr[newTail-1]+=1;
            }else {
                newArr[newTail]=num;
            }
            tail2--;
            newTail--;
        }
        //创建返回的链表
        ListNode newHead=new ListNode();
        ListNode p=newHead;
        if(newArr[0]!=0){
            p.val=newArr[0];
            p.next=new ListNode();
            p=p.next;
        }
        for (int i = 1; i <newLen; i++) {
            p.val=newArr[i];
            if(i!=newLen-1){
                p.next=new ListNode();
                p=p.next;
            }
        }
        return newHead;
    }
}
