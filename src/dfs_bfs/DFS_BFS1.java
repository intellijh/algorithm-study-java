package dfs_bfs;

import java.util.*;

public class DFS_BFS1 {
    public static int N = 0;
    public static int M = 0;
    public static int[][] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        graph = new int[N][M];
        int answer = 0;

        for (int i = 0; i < N; i++) {
            String row = sc.nextLine();

            for (int j = 0; j < M; j++) {
                graph[i][j] = row.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (dfs(i, j)) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }

    public static boolean dfs(int startRow, int startCol) {
        if (startRow < 0 || startRow >= N || startCol < 0 || startCol >= M) {
            return false;
        }

        if (graph[startRow][startCol] == 0) {
            graph[startRow][startCol] = 1;

            dfs(startRow - 1, startCol);
            dfs(startRow + 1, startCol);
            dfs(startRow, startCol - 1);
            dfs(startRow, startCol + 1);
            return true;
        }
        return false;
    }
}
