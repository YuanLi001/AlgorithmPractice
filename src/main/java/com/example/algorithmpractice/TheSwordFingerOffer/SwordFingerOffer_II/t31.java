package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_II;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/9 16:14
 */
public class t31 {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        int len=pushed.length;
        if(len==0){
            return true;
        }
        int[] stack=new int[len];
        int base=0,top=0;
        int i=0,j=0;
        while ( i<len ){

            while ( i<len && ( top==base || stack[top-1]!=popped[j] ) ){
                System.out.println("top:"+top+" i:"+i);
                stack[top]=pushed[i];
                i++;
                top++;
            }
            //栈顶是否有要弹出的元素
            while (top!=base && stack[top-1]==popped[j]  ){
                top--;
                j++;
            }
        }
        if(top==base){
            return true;
        }else {
            return false;
        }
    }
//[8,9,2,3,7,0,5,4,6,1]
//        [6,8,2,1,3,9,0,7,4,5]
    public static void main(String[] args) {
        int[] a={8,9,2,3,7,0,5,4,6,1};
        int[] b={6,8,2,1,3,9,0,7,4,5};
        validateStackSequences(a,b);
    }
}
