package CODEFORCE;
import java.util.*;
public class Morning_Sandwich {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int b = s.nextInt();
            int c = s.nextInt();
            int h = s.nextInt();

            int minSum = Math.min(b - 1, c + h);
            int ans = 2 * minSum + 1;
            System.out.println(ans);
        }
    }
}

