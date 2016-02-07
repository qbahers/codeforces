import java.util.*;

public class C {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        long x1 = in.nextInt();
        long y1 = in.nextInt();
        long x2 = in.nextInt();
        long y2 = in.nextInt();

        long[] x = new long[N];
        long[] y = new long[N];

        for (int i = 0; i < N; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }

        long res = Long.MAX_VALUE;

        for (int i = -1; i < N; i++) {
            long r1 = (i != -1) ? square(x[i] - x1) + square(y[i] - y1) : 0;
            long r2 = 0;

            for (int j = 0; j < N; j++) {
                long r = square(x[j] - x1) + square(y[j] - y1);

                if (r > r1) {
                    r2 = Math.max(r2, square(x[j] - x2) + square(y[j] - y2));
                }
            }

            res = Math.min(res, r1 + r2);
        }

        System.out.println(res);
    }

    private static long square(long x) {
        return x * x;
    }

}