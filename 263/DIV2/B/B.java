import java.util.*;

public class B {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        String cards = in.next();

        long[] nbOccurences = new long[26];
        for (int i = 0; i < n; i++) {
            nbOccurences[cards.charAt(i) - 'A']++;
        }

        Arrays.sort(nbOccurences);

        long res = 0;
        for (int i = 25; i >=0; i--) {
            long tmp = Math.min(k, nbOccurences[i]);
            k -= tmp;
            
            res += tmp * tmp;

            if (k == 0) break;
        }

        System.out.println(res);
    }

}
