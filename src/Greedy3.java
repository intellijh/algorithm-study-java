import java.util.Arrays;
import java.util.Scanner;

public class Greedy3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String t = sc.nextLine();
        int[] fears = new int[N];
        int result = 0;

        for (int i = 0; i < N; i++) {
            fears[i] = sc.nextInt();
        }
        Arrays.sort(fears);

        int count = 0;
        for (int i = 0; i < N; i++) {
            count++;
            if (count >= fears[i]) {
                count = 0;
                result++;
            }
        }

        System.out.println(result);
    }
}
