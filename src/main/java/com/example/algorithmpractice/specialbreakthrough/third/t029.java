package com.example.algorithmpractice.specialbreakthrough.third;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/11 7:30
 */
public class t029 {
    public Node insert(Node head, int insertVal) {
        Node node=new Node(insertVal);
        if(head==null){
            node.next=node;
            return node;
        }
        if(head.next==head){
            head.next=node;
            node.next=head;
            return head;
        }
        Node pHead=head,pNext=pHead.next;
        while (true){
            if(pHead.val> pNext.val){
                if(insertVal>= pHead.val || insertVal<= pNext.val){
                    pHead.next=node;
                    node.next=pNext;
                    return head;
                }
            }else if( insertVal>= pHead.val && insertVal<= pNext.val ){
                pHead.next=node;
                node.next=pNext;
                return head;
            }
            if(pHead.next==head){
                node.next=head.next;
                head.next=node;
                return head;
            }
            pHead=pHead.next;
            pNext=pHead.next;
        }

    }
}
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
}
