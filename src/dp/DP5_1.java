package dp;

import java.util.*;

public class DP5_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> power = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            power.add(sc.nextInt());
        }

        for (Integer i : power) {
            System.out.print(i + " ");
        }

        Collections.reverse(power);

        for (Integer i : power) {
            System.out.print(i + " ");
        }

        int[] dp = new int[N];
        Arrays.fill(dp, 1);

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (power.get(j) < power.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxValue = 0;
        for (int i = 0; i < N; i++) {
            maxValue = Math.max(maxValue, dp[i]);
        }
        System.out.println(N - maxValue);
    }
}
