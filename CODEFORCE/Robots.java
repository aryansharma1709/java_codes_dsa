package CODEFORCE;
import java.util.*;
public class Robots {
    public class Main{

        static void solve(long n, long m, Scanner sc) {
            List<Pair> l = new ArrayList<>();
            for (long i = 0; i < n; i++) {
                String s=sc.next();
                for (long j = 0; j < m; j++) {
                    char ch = s.charAt((int)(j));
                    if (ch == 'R') {
                        l.add(new Pair(i, j));
                    }
                }
            }

            for (int i = 0; i < l.size(); i++) {  // Use l.size() instead of n
                long x = l.get(i).first;
                long y = l.get(i).second;
                int count = 0;
                for (int j = 0; j < l.size(); j++) {  // Use l.size() instead of m
                    if (i != j) {
                        long x1 = l.get(j).first;
                        long y2 = l.get(j).second;
                        if (x <= x1 && y <= y2) {  // Correct the condition as per the original logic
                            count++;
                        }
                    }
                }
                if (count == l.size() - 1) {
                    System.out.println("YES");
                    return;
                }
            }
            System.out.println("NO");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long t = sc.nextLong();
            while (t-- > 0) {
                long n = sc.nextLong();
                long m = sc.nextLong();
                solve(n, m, sc);  // Pass the scanner as an argument
            }
        }

        static class Pair {
            long first;
            long second;

            Pair(long first, long second) {
                this.first = first;
                this.second = second;
            }
        }
    }
}
