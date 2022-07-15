//package com.example.algorithmpractice.SwordFingerOffer;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author YuanLi
// * @version 1.0
// * @date 2022/3/12 9:23
// */
//public class t35 {
//    public static void main(String[] args) {
//        Map<String,Integer> map=new HashMap<>();
//        map.put("qwe",111);
//        map.put("asd",222);
//        map.put(null,333);
//        System.out.println(map);
//        Integer integer = map.get("qwe");
//        System.out.println(integer);
//        Integer integer1 = map.get(null);
//        System.out.println(integer1);
////        System.out.println(map.get(theHead));
//
//        Integer integer2 = map.get("xxxxxxx");
//        System.out.println("==============");
//        System.out.println(integer2);
//
//    }
//
////    Map<Node, Node> cachedNode = new HashMap<Node, Node>();
////
////    public Node copyRandomList(Node head) {
////        if (head == null) {
////            return null;
////        }
////        if (!cachedNode.containsKey(head)) {
////            Node headNew = new Node(head.val);
////            cachedNode.put(head, headNew);
////            headNew.next = copyRandomList(head.next);
////            headNew.random = copyRandomList(head.random);
////        }
////        return cachedNode.get(head);
//
////    }
//
//    Map<Node,Node> map=new HashMap<>();
//    public Node copyRandomList(Node head){
//        if(head==null){
//            return null;
//        }
//        Node theHead=head;
//        while (theHead!=null){
////            if(theHead.next!=null){
//            Node newNode=new Node(theHead.val);
//            map.put(theHead,newNode);
////            }else {
////                map.put(theHead,null);
////            }
//            theHead=theHead.next;
//        }
//        theHead=head;
//        while (theHead!=null){
//            Node node = map.get(theHead);
//            if(theHead.next!=null){
//                node.next=map.get(  theHead.next );
//            }else{
//                node.next=null;
//            }
//            node.random=map.get( theHead.random);
//            theHead=theHead.next;
//        }
//
////        return map.get(theHead);  此时theHead已经为null
//        return map.get(head);
//    }
//
//}
//
//class Node {
//    int val;
//    Node next;
//    Node random;
//
//    public Node(int val) {
//        this.val = val;
//        this.next = null;
//        this.random = null;
//    }
//}
