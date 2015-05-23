import java.util.*;

public class C {
    private static int N;
    private static int M;
    private static char[][] board;
    private static boolean[][] marked;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        N = in.nextInt();
        M = in.nextInt();

        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = in.next().toCharArray();
        }

        int r1 = in.nextInt() - 1;
        int c1 = in.nextInt() - 1;

        int r2 = in.nextInt() - 1;
        int c2 = in.nextInt() - 1;

        marked = new boolean[N][M];

        char c = board[r2][c2];
        board[r1][c1] = '.';
        board[r2][c2] = '.';

        int count = 0;
        int[] dr = new int[]{0, 1, 0, -1};
        int[] dc = new int[]{1, 0, -1, 0};
        for (int i = 0; i < 4; i++) {
            if (r2 + dr[i] >= 0 && r2 + dr[i] < N &&
                c2 + dc[i] >= 0 && c2 + dc[i] < M &&
                board[r2 + dr[i]][c2 + dc[i]] == '.') {

                count++;
            }
        }

        if (r1 == r2 && c1 == c2) {
            if (count >= 1) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        else {
            dfs(r1, c1);

            if (marked[r2][c2]) {
                if (count <= 1) {
                    if (c == 'X') {
                        System.out.println("YES");
                    }
                    else {
                        System.out.println("NO");
                    }
                }
                else {
                    System.out.println("YES");
                }
            }
            else {
                System.out.println("NO");
            }
        }
    }

    private static void dfs(int r, int c) {
        marked[r][c] = true;

        int[] dr = new int[]{0, 1, 0, -1};
        int[] dc = new int[]{1, 0, -1, 0};
        
        for (int i = 0; i < 4; i++) {
            if (r + dr[i] >= 0 && r + dr[i] < N &&
                c + dc[i] >= 0 && c + dc[i] < M &&
                board[r + dr[i]][c + dc[i]] == '.' &&
                !marked[r + dr[i]][c + dc[i]]) {

                dfs(r + dr[i], c + dc[i]);
            }
        }
    }

}