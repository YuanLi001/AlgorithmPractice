package com.example.algorithmpractice.specialbreakthrough.second;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/10 8:43
 */
public class t028 {

    public Node flatten(Node head) {
        Node newHead=head;
        while (newHead!=null){
            if(newHead.child!=null){
                Node tail= getChildTail(newHead.child);

                //判断一下newHead后还有没有节点
                if(newHead.next!=null){
                    tail.next=newHead.next;
                    newHead.next.prev=tail;
                }

                newHead.next=newHead.child;
                newHead.child.prev=newHead;

                flatten(newHead.child);
                newHead.child=null;
            }
            newHead=newHead.next;
        }
        return head;
    }

    public Node getChildTail(Node head) {
        while (head.next!=null){
            head=head.next;
        }
        return head;
    }

}

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
}
