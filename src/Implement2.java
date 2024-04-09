import java.util.*;

public class Implement2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int hour = 0;
        int minute = 0;
        int second = 0;
        int result = 0;

        while (hour <= N) {
            if (second == 60) {
                second = 0;
                minute++;
            }
            if (minute == 60) {
                minute = 0;
                hour++;
            }

            if (second % 10 == 3 || second / 10 == 3 ||
                    minute % 10 == 3 || minute / 10 == 3 ||
                    hour % 10 == 3) {
                result++;
                System.out.println(hour + ":" + minute + ":" + second);
            }
            second++;
        }

        System.out.println(result);
    }
}
