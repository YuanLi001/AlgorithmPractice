package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_DesignProblems;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/9 9:17
 */
public class t2 {
}

class MinStack {
    private int base=0;
    private int top=0;
    private int[] arrMin=new int[30000];
    private int[] stack=new int[30000];

    public MinStack() {

    }

    public void push(int val) {
        if(top==0){
            arrMin[top]=val;
        }else {
            if( val<arrMin[top-1] ){
                arrMin[top]=val;
            }else{
                arrMin[top]=arrMin[top-1];
            }
        }
        stack[top]=val;
        top++;
    }

    public void pop() {
        top--;
    }

    public int top() {
        return stack[top-1];
    }

    public int getMin() {
        return arrMin[top-1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
