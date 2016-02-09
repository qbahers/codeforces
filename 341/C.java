import java.util.*;

public class C {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int P = in.nextInt();

        int[] l = new int[N];
        int[] r = new int[N];

        double[] a = new double[N];

        for (int i = 0; i < N; i++) {
            l[i] = in.nextInt();
            r[i] = in.nextInt();

            a[i] = r[i] / P - (l[i] - 1) / P;
        }

        double count = 0;
        for (int i = 0; i < N; i++) {
            count += a[i] / (r[i] - l[i] + 1);
            
            count += a[(i + 1) % N] * (r[i] - l[i] + 1 - a[i]) / (r[i] - l[i] + 1) / (r[(i + 1) % N] - l[(i + 1) % N] + 1);
        }

        System.out.println(count * 2000);
    }

}