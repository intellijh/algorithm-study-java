package dp;

import java.util.*;

public class DP4 {

    public static int T;
    public static int n;
    public static int m;
    public static int[][] gold;
    public static int[][] d;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        int[] answer = new int[T];

        for (int z = 0; z < T; z++) {
            n = sc.nextInt();
            m = sc.nextInt();
            gold = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    gold[i][j] = sc.nextInt();
                }
            }
            d = new int[n][m];
            for (int i = 0; i < n; i++) {
                d[i][0] = Math.max(d[i][0], gold[i][0]);
            }

            int max = 0;
            for (int i = 1; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    d[j][i] = Math.max(d[j][i - 1] + gold[j][i], d[j][i]);
                    if (j - 1 >= 0) {
                        d[j][i] = Math.max(d[j -1][i - 1] + gold[j][i], d[j][i]);
                    }
                    if (j + 1 < n) {
                        d[j][i] = Math.max(d[j + 1][i - 1] + gold[j][i], d[j][i]);
                    }
                    if (i == m - 1) {
                        max = Math.max(max, d[j][m - 1]);
                        answer[z] = max;
                    }
                }
            }
        }

        for (int a : answer) {
            System.out.println(a);
        }
    }
}
