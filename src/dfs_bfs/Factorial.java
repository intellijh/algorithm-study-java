package dfs_bfs;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial_iterative(13));
    }

    public static long factorial_iterative(long n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial_iterative(n - 1);
    }
}
