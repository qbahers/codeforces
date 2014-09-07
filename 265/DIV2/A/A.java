import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        char[] a = in.next().toCharArray();

        int sum = 0;
        if (a[0] == '0') {
            System.out.println(1);
        }
        else {
            for (int i = 0; i < n; i++) {
                if (a[i] == '1') {
                    sum++;
                }
                else {
                    break;
                }
            }
            System.out.println(Math.min(n, sum + 1));
        }
    }
}
