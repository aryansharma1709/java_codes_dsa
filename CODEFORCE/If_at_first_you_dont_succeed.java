package CODEFORCE;
import java.util.*;
public class If_at_first_you_dont_succeed {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int n = s.nextInt();
            System.out.println(fail(a, b, c, n));
        }

        public static int fail(int a, int b, int c, int n) {
            if (n < c || c > a || c > b) {
                return -1;
            }

            int ans = n - (a + b - c);

            if (ans <= 0) {
                return -1;
            }

            return ans;
        }
}
