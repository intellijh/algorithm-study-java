package Impl;

import java.util.*;

public class Implement4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String answer = "";

        String alphabet = "";
        int number = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) >= 65) {
                alphabet += S.charAt(i);
            } else {
                number += S.charAt(i) - '0';
            }
        }

        char[] alphaArr = new char[alphabet.length()];
        for (int i = 0; i < alphaArr.length; i++) {
            alphaArr[i] = alphabet.charAt(i);
        }
        Arrays.sort(alphaArr);

        for (char n : alphaArr) {
            answer += n;
        }
        answer += number;

        System.out.println(answer);
    }
}
