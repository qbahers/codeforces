import java.util.*;

public class B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();

        char[][] map = new char[n][n];
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                map[i][j] = 'S';

        outer:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (k == 0) {
                    break outer;
                }
                else if ((i + j) % 2 == 0) {
                    map[i][j] = 'L';
                    k--;
                }
            }
        }

        if (k > 0) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
            for (int i = 0; i < n; i++) {
                System.out.println(map[i]);
            }
        }
    }

}