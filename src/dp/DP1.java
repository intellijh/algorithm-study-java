package dp;

import java.util.*;

public class DP1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num));

        int[] d = new int[N];

        d[0] = num[0];
        d[1] = Math.max(d[0], num[1]);

        for (int i = 2; i < N; i++) {
            d[i] = Math.max(d[i - 1], d[i - 2] + num[i]);
        }

        System.out.println(d[N-1]);
    }
}
