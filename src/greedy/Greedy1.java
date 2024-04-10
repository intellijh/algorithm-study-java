package greedy;

public class Greedy1 {

    public static void main(String[] args) {

        System.out.println(greedy(17, 4));
    }

    public static int greedy(int N, int K) {

        int answer = 0;

        while (N != 1) {
            if (N % K == 0) {
                N /= K;
            } else {
                N += - 1;
            }
            answer++;
        }

        return answer;
    }
}
