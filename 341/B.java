import java.util.*;

public class B {
    private static final int L = 1000;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] a = new int[2 * L + 1];
        int[] b = new int[2 * L + 1];

        for (int i = 0; i < N; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            a[x + y]++;
            b[L + 1 - x + y]++;
        }

        long count = 0;
        for (int i = 2; i < 2 * L + 1; i++) {
            if (a[i] > 1) count += a[i] * (a[i] - 1) / 2;
            if (b[i] > 1) count += b[i] * (b[i] - 1) / 2;
        }

        System.out.println(count);
    }

}