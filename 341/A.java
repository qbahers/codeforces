import java.util.*;

public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        long sum = 0;
        int minOdd = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int num = in.nextInt();

            if (num % 2 == 1 && num < minOdd) {
                minOdd = num;
            }

            sum += num;
        }

        long res = (sum % 2 == 0) ? sum : sum - minOdd;

        System.out.println(res);
    }

}