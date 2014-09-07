import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        
        int[] a = new int[n]; 
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int sum = 0;
        boolean readLetters = false;
        int gap = 0;
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                readLetters = true;
                gap = 0;
                sum += tmp + 1;
                tmp = 0;
            }
            else {
                if (!readLetters) {
                    continue;
                }
                else {
                    gap++;
                    if (gap == 1) {
                        tmp++;
                    }
                    else {
                        continue;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
