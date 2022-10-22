package com.example.algorithmpractice.specialbreakthrough.eight;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/22 9:00
 */
public class UpdateMatrix_II {
    static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] dist = new int[m][n];
        boolean[][] seen = new boolean[m][n];
        Deque<int[]> deque = new ArrayDeque<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    deque.offer(new int[]{i, j});
                    seen[i][j] = true;
                }
            }
        }


        while (!deque.isEmpty()) {
            int[] poll = deque.poll();
            int i = poll[0], j = poll[1];
            for (int k = 0; k < 4; k++) {
                int ni = i + dirs[k][0], nj =j+ dirs[k][1];
                if (ni >= 0 && ni < m && nj >= 0 && nj < n && !seen[ni][nj]) {
                    dist[ni][nj] = dist[i][j] + 1;
                    deque.offer(new int[]{ni, nj});
                    seen[ni][nj] = true;
                }
            }
        }
        return dist;
    }
}
