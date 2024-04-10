package dfs_bfs;

public class Recursive {

    public static void main(String[] args) {
        recursive_function(1);
    }

    public static void recursive_function(int i) {
        if (i == 100) {
            return;
        }

        System.out.println(i + "번쨰 재귀함수에서 " + (i + 1) + "번째 재귀함수를 호출");
        recursive_function(i + 1);
        System.out.println(i + "번째 재귀함수 종료");
    }
}
