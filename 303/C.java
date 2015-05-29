import java.util.*;

public class C {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();

        int[] x = new int[n];
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
            h[i] = in.nextInt();
        }

        int count = Math.min(n, 2);
        int y = x[0];
        for (int i = 1; i < n - 1; i++) {
            if (y < x[i] - h[i]) {
                count++;
                y = x[i];
            }
            else if (x[i] + h[i] < x[i + 1]) {
                count++;
                y = x[i] + h[i];
            }
            else {
                y = x[i];
            }
        }

        System.out.println(count);
    }

}