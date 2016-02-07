import java.util.*;

public class B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int length = 0;
        long res = 0;

        for (int i = 0; i < N; i++) {
            int v = in.nextInt();

            length++;

            if (v == 1) {
                if (res == 0) res = 1;
                else          res *= length;

                length = 0;
            }
        }

        System.out.println(res);
    }

}