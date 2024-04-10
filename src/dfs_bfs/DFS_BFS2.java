package dfs_bfs;

import java.util.*;

public class DFS_BFS2 {
    static int N = 0;
    static int M = 0;
    static int[][] graph;
    static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        graph = new int[N][M];

        for (int i = 0; i < N; i++) {
            String row = sc.nextLine();
            for (int j = 0; j < M; j++) {
                graph[i][j] = row.charAt(j) - '0';
            }
        }
        System.out.println(Arrays.deepToString(graph));

        answer = dfs(0, 0);
        System.out.println(answer);
    }

    public static int dfs(int row, int col) {
        int result = 0;
        System.out.println(row + " " + col + " ");
        if (row < 0 || row >= N || col < 0 || col >= M) {
            System.out.println("들어감");
            result = 999999;
            return result;
        }
        if (graph[row][col] == 0) {
            result = 999999;
            return result;
        }

        result++;
        if (row == N - 1 && col == N - 1) {
            return result;
        }

        int c1 = Math.min(dfs(row - 1, col), dfs(row + 1, col));
        int c2 = Math.min(dfs(row, col - 1), dfs(row, col + 1));

        return result += Math.min(c1, c2);
    }
}
