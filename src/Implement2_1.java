import java.util.Scanner;

public class Implement2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if (k % 10 == 3 || k / 10 == 3 ||
                            j % 10 == 3 || j / 10 == 3 ||
                            i % 10 == 3) {

                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
