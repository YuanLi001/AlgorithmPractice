package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/23 10:36
 */
public class t1 {

    boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        int h=board.length,w=board[0].length;
        visited=new boolean[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                boolean b = check(board, word, i, j, 0);
                if(b){
                    return b;
                }
            }
        }
        return false;
    }

    public boolean check(char[][] board,String s,int i,int j,int k){
        if(board[i][j]!=s.charAt(k)){
            return false;
        }else{
            if(k==s.length()-1){
                return true;
            }
        }
        visited[i][j]=true;
        boolean result=false;
        int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
        int newi,newj;
        for (int l = 0; l < directions.length; l++) {
            newi=i+directions[l][0];
            newj=j+directions[l][1];
            if (!visited[newi][newj]) {
                if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length) {
                    boolean b = check(board, s, newi, newj, k + 1);
                    if (b) {
                        result = true;
                        break;
                    }
                }
            }
        }
        visited[i][j]=false;
        return result;
    }
}
