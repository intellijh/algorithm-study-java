package Impl;

import java.util.Scanner;
import java.util.*;

public class Implement1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coordinate = {1, 1};
        int N = sc.nextInt();
        sc.nextLine();
        String plan = sc.nextLine();

        for (int i = 0; i < plan.length(); i++) {
            char p = plan.charAt(i);

            switch (p) {
                case 'U':
                    if (coordinate[0] > 1) {
                        coordinate[0]--;
                    }
                    break;
                case 'D':
                    if (coordinate[0] < N) {
                        coordinate[0]++;
                    }
                    break;
                case 'L':
                    if (coordinate[1] > 1) {
                        coordinate[1]--;
                    }
                    break;
                case 'R':
                    if (coordinate[1] < N) {
                        coordinate[1]++;
                    }
                    break;
            }
        }

        System.out.println(Arrays.toString(coordinate));
    }
}
