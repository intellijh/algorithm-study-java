package dfs_bfs;

import java.util.*;

public class DFS_BFS2_1 {
    static int N = 0;
    static int M = 0;
    static int[][] graph;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

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

        System.out.println(bfs(0, 0));
    }

    public static int bfs(int row, int col) {
        Queue<ArrayList<Integer>> q = new LinkedList<>();
        q.offer(new ArrayList<>(Arrays.asList(row, col)));

        while (!q.isEmpty()) {
            ArrayList<Integer> list = q.poll();
            int r = list.get(0);
            int c = list.get(1);

            for (int i = 0; i < 4; i++) {
                int nextR = r + dx[i];
                int nextC = c + dy[i];

                if (nextR < 0 || nextR >= N || nextC < 0 || nextC >= M) {
                    continue;
                }
                if (graph[nextR][nextC] == 0) {
                    continue;
                }
                if (graph[nextR][nextC] == 1) {
                    ArrayList<Integer> nextList = new ArrayList<>();
                    nextList.add(nextR);
                    nextList.add(nextC);
                    graph[nextR][nextC] = graph[r][c] + 1;
                    q.offer(nextList);
                }
            }

        }

        return graph[N-1][M-1];
    }
}
