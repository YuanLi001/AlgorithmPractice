package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/20 21:15
 */
public class t_12guanfang {
    public boolean exist(char[][] board, String word) {
        int h = board.length, w = board[0].length;
        boolean[][] visited = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                boolean flag = check(board, visited, i, j, word, 0);
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean check(char[][] board, boolean[][] visited, int i, int j, String s, int k) {
        if (board[i][j] != s.charAt(k)) {
            return false;
        } else if (k == s.length() - 1) {
            return true;
        }
        visited[i][j] = true;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean result = false;
        for (int[] dir : directions) {
            int newi = i + dir[0], newj = j + dir[1];
            if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length) {
                if (!visited[newi][newj]) {
                    boolean flag = check(board, visited, newi, newj, s, k + 1);
                    if (flag) {
                        result = true;
                        break;
                    }
                }
            }
        }
        visited[i][j] = false;
        return result;
    }


    public static void main(String[] args) {
//        long l = System.currentTimeMillis();
//        System.out.println(l);
        boolean[][] visted=new boolean[4][4];
        for (int i = 0; i < visted.length; i++) {
            for (int j = 0; j < visted[0].length; j++) {
                System.out.print(visted[i][j]+" ");
            }
            System.out.println();
        }
    }



    boolean[][] visted;

    public boolean exist2(char[][] board, String word) {
        int h=board.length,w=board[0].length;
        visted=new boolean[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                boolean b = check2(board, i, j, word, 0);
                if(b){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean check2(char[][] board,int i,int j,String s,int k){
        if(board[i][j]!=s.charAt(k)){
            return false;
        }else if(k==s.length()-1){
            return true;
        }
        visted[i][j]=true;
        int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
        boolean result=false;
        int newi,newj;
        for (int l = 0; l < directions.length; l++) {
            newi=i+directions[l][0];
            newj=j+directions[l][1];
            if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length) {
                if (!visted[newi][newj]) {
                    boolean f = check2(board, newi, newj, s, k + 1);
                    if (f) {
                        result=true;
                        break;
                    }
                }
            }
        }
        visted[i][j]=false;
        return result;
    }
}
