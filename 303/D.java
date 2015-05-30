import java.util.*;

public class D {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = in.nextInt();
        }

        Arrays.sort(t);

        double sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (sum <= t[i]) {
                count++;
                sum += t[i];
            }
        }

        System.out.println(count);
    }

}