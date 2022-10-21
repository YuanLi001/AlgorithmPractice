package com.example.algorithmpractice.specialbreakthrough.eight;

import java.util.Arrays;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/21 9:16
 */
public class IsBipartite_DFS {
    private static final int UNCOLORED=0;
    private static final int RED=1;
    private static final int GREEN=2;
    private int[] color;
    private boolean valid;
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        valid=true;
        color=new int[n];
        Arrays.fill(color,UNCOLORED);
        for (int i = 0; i < n && valid; i++) {
            if(color[i]==UNCOLORED){
                dfs(i,RED,graph);
            }
        }
        return valid;
    }

    public void dfs(int i,int c,int[][] graph){
        color[i]=c;
        int cNei=  c==RED? GREEN:RED ;
        for(int num:graph[i]){
            if(color[num]==UNCOLORED){
                dfs(num,cNei,graph);
                if(!valid){
                    return;
                }
            }else if(color[num]!=cNei){
                valid=false;
                return;
            }
        }
    }
}
