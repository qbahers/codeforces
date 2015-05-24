import java.util.*;

public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int k = in.nextInt();
        String q = in.next();

        int N = q.length();

        if (k > N) {
            System.out.println("NO");
        }
        else {
            Set<Character> used = new HashSet<Character>();
            int[] a = new int[N];
            int j = 0;
            for (int i = 0; i < N; i++) {
                if (!used.contains(q.charAt(i))) {
                    a[j] = i;
                    used.add(q.charAt(i));
                    j++;
                }
            }

            if (j < k) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");

                for (int i = 0; i < k - 1; i++) {
                    System.out.println(q.substring(a[i], a[i + 1]));
                }
                System.out.println(q.substring(a[k - 1], N));
            }
        }
    }

}