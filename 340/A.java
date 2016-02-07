import java.util.*;

public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        int res = (int) Math.ceil(x / 5.0);

        System.out.println(res);
    }

}