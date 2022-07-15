package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;



/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/12 8:49
 */
public class t6 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        System.out.println(arr.length);
    }

    public int[] reversePrint(ListNode head) {
        int[] arr=new int[10000];
        int cn=0;
        while (head!=null){
            arr[cn]=head.val;
            cn++;
            head=head.next;
        }
        int[] arr2=new int[cn];
        for (int i = cn-1,j=0; i >=0; i--,j++) {
            arr2[j]=arr[i];
        }
        return arr2;
    }
}
