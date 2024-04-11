package dp;

import java.util.Arrays;
import java.util.Scanner;

public class DP2_1 {

    public static int[] d;
    public static int X;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();

        d = new int[X + 1];

        for (int i = 2; i < X + 1; i++) {
            d[i] = d[i - 1] + 1;

            if (i % 5 == 0) {
                d[i] = Math.min(d[i / 5] + 1, d[i]);
            }
            if (i % 3 == 0) {
                d[i] = Math.min(d[i / 3] + 1, d[i]);
            }
            if (i % 2 == 0) {
                d[i] = Math.min(d[i / 2] + 1, d[i]);
            }
        }

        System.out.println(d[X]);
    }
}
