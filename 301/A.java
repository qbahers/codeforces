import java.util.*;

public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        
        char[] a = in.next().toCharArray();
        char[] b = in.next().toCharArray();

        int res = 0;
        for (int i = 0; i < N; i++) {
            int diff = Math.abs(a[i] - b[i]);

            res += Math.min(diff, 10 - diff);
        }

        System.out.println(res);
    }

}