import java.util.*;

public class B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        char[] s = in.next().toCharArray();
        char[] t = in.next().toCharArray();

        int n = s.length;

        boolean[] diff = new boolean[n];
        int d = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] != t[i]) {
                diff[i] = true;
                d++;
            }
        }

        if (d % 2 != 0) {
            System.out.println("impossible");
        }
        else {
            d /= 2;
            char[] p = s;
            for (int i = 0; i < n; i++) {
                if (diff[i] && d > 0) {
                    p[i] = (s[i] == '1') ? '0' : '1';
                    d--;
                }
            }
            System.out.println(new String(p));
        }
    }

}