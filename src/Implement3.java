import java.util.*;

public class Implement3 {

    public static void main(String[] args) {
        int answer = 0;

        int[] dx = {-2, -1, 1, 2, 2, 1, -1, 2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        Scanner sc = new Scanner(System.in);
        String coordinate = sc.nextLine();
        int row = coordinate.charAt(1) - '0';
        int col = coordinate.charAt(0) - 'a' + 1;

        for (int i = 0; i < 8; i++) {
            int nextRow = row + dx[i];
            int nextCol = col + dy[i];

            if (nextRow >= 1 && nextRow <= 8 && nextCol >= 1 && nextCol <= 8) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
