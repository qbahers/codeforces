import java.util.*;

public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();

        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = in.nextInt();

        List<Integer> goodCars = new ArrayList<Integer>();

        outer:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1 || a[i][j] == 3) {
                    continue outer;
                }
            }
            goodCars.add(i + 1);
        }

        System.out.println(goodCars.size());
        for (int x : goodCars) {
            System.out.print(x + " ");
        }
    }

}