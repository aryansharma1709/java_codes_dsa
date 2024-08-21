package CODEFORCE;
import java.util.*;
public class Color_Blind_Ness {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            String a[] = new String[2];
            for (int i = 0; i < 2; i++) {
                a[i] = s.next();
            }

            a[0] = a[0].replace('G', 'B');
            a[1] = a[1].replace('G', 'B');
            System.out.println(a[0].equals(a[1]) ? "YES" : "NO");
        }
    }
}
