package greedy;

import java.util.Scanner;

public class Greedy2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        int result = number.charAt(0) - '0';
        for (int i = 1; i < number.length(); i++) {
            int num = number.charAt(i) - '0';
            System.out.println(num);
            if (num <= 1 || result <= 1) {
                result += num;
            } else {
                result *= num;
            }
        }

        System.out.println(result);
    }
}
