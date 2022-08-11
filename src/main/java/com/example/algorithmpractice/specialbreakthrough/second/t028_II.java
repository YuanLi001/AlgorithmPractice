package com.example.algorithmpractice.specialbreakthrough.second;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/10 9:34
 */
public class t028_II {
    public com.example.algorithmpractice.specialbreakthrough.second.Node flatten(com.example.algorithmpractice.specialbreakthrough.second.Node head) {
        dfs(head);
        return head;
    }

    public com.example.algorithmpractice.specialbreakthrough.second.Node dfs(com.example.algorithmpractice.specialbreakthrough.second.Node node) {
        com.example.algorithmpractice.specialbreakthrough.second.Node cur = node;
        // 记录链表的最后一个节点
        com.example.algorithmpractice.specialbreakthrough.second.Node last = null;

        while (cur != null) {
            com.example.algorithmpractice.specialbreakthrough.second.Node next = cur.next;
            //  如果有子节点，那么首先处理子节点
            if (cur.child != null) {
                com.example.algorithmpractice.specialbreakthrough.second.Node childLast = dfs(cur.child);

                //  将 node 与 child 相连
                cur.next = cur.child;
                cur.child.prev = cur;

                //  如果 next 不为空，就将 last 与 next 相连
                if (next != null) {
                    childLast.next = next;
                    next.prev = childLast;
                }

                // 将 child 置为空
                cur.child = null;
                last = childLast;
            } else {
                last = cur;
            }
            cur = next;
        }
        return last;
    }

}
