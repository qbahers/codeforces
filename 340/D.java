import java.util.*;

public class D {
    private static final int[] x = new int[3];
    private static final int[] y = new int[3];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }

        int res = 3;

        if ((x[0] == x[1] && x[1] == x[2]) || (y[0] == y[1] && y[1] == y[2])) {
            res = 1;
        }
        else if (helper(0, 1, 2) || helper(0, 2, 1) || helper(1, 2, 0)) {
            res = 2;
        } 

        System.out.println(res);
    }

    private static boolean helper(int i, int j, int k) {
        return (
            (x[i] == x[j] && (y[k] <= Math.min(y[i], y[j]) || y[k] >= Math.max(y[i], y[j]))) ||
            (y[i] == y[j] && (x[k] <= Math.min(x[i], x[j]) || x[k] >= Math.max(x[i], x[j])))
        );
    } 

}