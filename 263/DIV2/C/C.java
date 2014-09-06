import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] numbers = new int[n];
        long res = 0;
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
            res += numbers[i];
        }

        Arrays.sort(numbers);

        long acc = numbers[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            acc += numbers[i];
            res += acc;
        }

        System.out.println(res);
    }
}
