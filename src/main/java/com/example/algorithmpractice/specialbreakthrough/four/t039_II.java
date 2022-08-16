package com.example.algorithmpractice.specialbreakthrough.four;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/16 12:20
 */
public class t039_II {
    public int largestRectangleArea(int[] heights){
        Deque<Integer> stack=new LinkedList<>();
        stack.push(-1);
        int max=0;
        for (int i = 0; i < heights.length; i++){
            while (stack.peek()!=-1 && heights[stack.peek()] > heights[i]){
                int height = heights[stack.peek()];
                stack.pop();
                int width=i - stack.peek() - 1;
                max=Math.max(max,height * width);
            }
            stack.push(i);
        }
        while (stack.peek()!=-1){
            int height = heights[stack.peek()];
            stack.pop();
            int width = heights.length - stack.peek() - 1;
            max = Math.max(max, height * width);
        }
        return max;
    }
}
