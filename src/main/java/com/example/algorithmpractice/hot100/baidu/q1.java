package com.example.algorithmpractice.hot100.baidu;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/3/1 12:03
 */
public class q1 {
    public static void main(String[] args) {
        Stu s=new Stu();
        System.out.println(s.val);
        System.out.println(s.next);
    }
}

class  Stu{
    int val;
    Stu next;
    public Stu() {
    }

    public Stu(int val) {
        this.val = val;
    }
}
