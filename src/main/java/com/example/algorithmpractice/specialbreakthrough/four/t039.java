package com.example.algorithmpractice.specialbreakthrough.four;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/16 11:21
 */
public class t039 {
    public int largestRectangleArea(int[] heights){
        Deque<Integer> stack=new LinkedList<>();
        stack.push(-1);
        int max=-1;
        for (int i = 0; i < heights.length; i++) {
            Integer peek = stack.peek();
            if(peek!=-1 && heights[peek]<=heights[i]){
                stack.push( i );
            }else{
                while ( heights[peek]>heights[i]){
                    Integer hindex = stack.pop();
                    peek=stack.peek();
                    max=Math.max(max, (i-peek-1)*heights[hindex] );
                }
                stack.push(i);
            }
        }
        Integer peek=stack.peek();
        while ( heights[peek]>0){
            Integer hindex = stack.pop();
            peek=stack.peek();
            max=Math.max(max, (heights.length-peek-1)*heights[hindex] );
        }
        return max;
    }
}
