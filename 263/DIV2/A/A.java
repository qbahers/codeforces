import java.util.*;

public class A {

    private static int n = 0;

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++)
            board[i] = in.next().toCharArray();

        boolean res = true;
        int even = 0;
        out:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                even = 0;
                
                if (onBoard(i - 1, j) && board[i - 1][j] == 'o') even++;
                if (onBoard(i + 1, j) && board[i + 1][j] == 'o') even++;
                if (onBoard(i, j - 1) && board[i][j - 1] == 'o') even++;
                if (onBoard(i, j + 1) && board[i][j + 1] == 'o') even++;
                
                if (even % 2 != 0) {
                    res = false;
                    break out;
                }
            }
        }

        if (res == true) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    private static boolean onBoard(int k, int l) {
        return (k >= 0 && k < n && l >= 0 && l < n);
    }
}
