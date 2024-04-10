package Impl;

import java.util.*;

public class Implement4_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String answer = "";

        ArrayList alphaList = new ArrayList();
        int number = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) >= 65) {
                alphaList.add(String.valueOf(S.charAt(i)));
            } else {
                number += S.charAt(i) - '0';
            }
        }

        alphaList.sort(Comparator.naturalOrder());

        for (Object s : alphaList) {
            answer += s;
        }
        answer += number;

        System.out.println(answer);
    }
}
