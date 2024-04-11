package dp;

import java.util.*;

public class DP3 {

    public static int[] money;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        money = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            money[i] = sc.nextInt();
        }

        int[] count = new int[M + 1];
        Arrays.fill(count, 99999);

        money[0] = 0;

        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                if (i % money[j] == 0) {
                    count[i] = i / money[j];
                }
                if (i >= money[j]) {
                    count[i] = Math.min(count[i - money[j]] + 1, count[i]);
                } else {
                    break;
                }
            }
        }

        if (count[M] == 99999) {
            count[M] = -1;
        }
        System.out.println(count[M]);
    }
}
