package dp;

import java.util.*;

public class DP2 {

    public static int[] d;
    public static int X;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();

        d = new int[X + 1];
        Arrays.fill(d, 99999);
        d[1] = 0;

        if (X == 1) {
            System.out.println(d[1]);
        } else {
            for (int i = 2; i < X + 1; i++) {
                if (i % 5 == 0) {
                    d[i] = Math.min(d[i / 5] + 1, d[i]);
                }
                if (i % 3 == 0) {
                    d[i] = Math.min(d[i / 3] + 1, d[i]);
                }
                if (i % 2 == 0) {
                    d[i] = Math.min(d[i / 2] + 1, d[i]);
                }
                d[i] = Math.min(d[i - 1] + 1, d[i]);

                if (i == X) {
                    System.out.println(d[i]);
                }
            }
        }
    }
}
