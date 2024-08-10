import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        int[][] dxy = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] board = new int[N][M];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    board[i][j] = sc.nextInt();
                }
            }

            int max_value = 0;

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    int cnt = board[i][j];

                    for (int k = 0; k < dxy.length; k++) {
                        int point_x = i + dxy[k][0];
                        int point_y = j + dxy[k][1];

                        if (point_x >= 0 && point_x < N && point_y >= 0 && point_y < M) {
                            cnt += board[point_x][point_y];
                        }
                    }
                    max_value = cnt > max_value ? cnt : max_value;
                }
            }
            System.out.println("#" + test_case + " " + max_value);
        }
    }
}