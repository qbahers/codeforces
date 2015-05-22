import java.util.*;

public class B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();
        int p = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        int[] a = new int[n];
        int pSum = 0;
        for (int i = 0; i < k; i++) {
            a[i] = in.nextInt();
            pSum += a[i];
        }

        if (pSum + (n - k) > x) {
            System.out.println(-1);
        }
        else {
            int qSum = x - pSum;
            for (int i = k; i < n; i++) {
                a[i] = 1;
                qSum--;
            }

            int j = k;
            while (qSum - (y - 1) >= 0 && j < n) {
                a[j] += y - 1;
                qSum -= y - 1;
                j++;
            }

            int[] b = a.clone();
            Arrays.sort(b);

            if (b[n / 2] < y) {
                System.out.println(-1);
            }
            else {
                for (int i = k; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }

} 