package dp;

import java.util.*;

public class DP5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] power = new int[N];
        for (int i = 0; i < N; i++) {
            power[i] = sc.nextInt();
        }

        int[] dp = new int[N];
        Arrays.fill(dp, N);

        for (int i = 1; i < N; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (power[j] > power[j - 1]) {
                    count++;
                }
            }
            dp[i] = count;
            dp[i] = Math.min(dp[i - 1] + count, dp[i]);
            System.out.println("count" + count);
            System.out.println("dp[" + i + "]" + dp[i]);
        }

        System.out.println(dp[N - 1]);
    }
}
