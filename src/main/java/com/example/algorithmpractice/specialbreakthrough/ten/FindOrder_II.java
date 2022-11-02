package com.example.algorithmpractice.specialbreakthrough.ten;

import java.util.*;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/11/2 15:52
 */
public class FindOrder_II {
    public int[] findOrder(int numCourses, int[][] prerequisites){
        if(numCourses<=0){
            return new int[0];
        }

        HashSet<Integer>[] adj=new HashSet[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj[i] = new HashSet<>();
        }
        int[] inDegree = new int[numCourses];
        for(int[] p:prerequisites){
            adj[ p[1] ].add( p[0] );
            inDegree[ p[0] ]++;
        }
        Queue<Integer> queue=new LinkedList<>();
        for (int i = 0; i < numCourses; i++){
            if(inDegree[i]==0){
                queue.offer( i );
            }
        }

        int[] res=new int[numCourses];
        int count=0;
        while (!queue.isEmpty()){
            Integer head = queue.poll();
            res[count] = head;
            count++;
            Set<Integer> successors = adj[head];
            for (Integer nextCourse : successors) {
                inDegree[nextCourse]--;
                // 马上检测该结点的入度是否为 0，如果为 0，马上加入队列
                if (inDegree[nextCourse] == 0) {
                    queue.offer(nextCourse);
                }
            }

        }
// 如果结果集中的数量不等于结点的数量，就不能完成课程任务，这一点是拓扑排序的结论
        if (count == numCourses) {
            return res;
        }
        return new int[0];
    }
}
