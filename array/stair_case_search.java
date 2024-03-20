package array;
import java.util.*;
public class stair_case_search {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int t = s.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++)
                a[i][j] = s.nextInt();
        }
        System.out.println(find_no(a, t));
    }

    public static boolean find_no(int[][] a, int t) {
        int r = a.length - 1;
        int j = 0;
        while (r >= 0 && j < a[0].length) {
            if (a[r][j] == t)
                return true;
            else if (a[r][j] > t)
                r--;
            else
                j++;
        }

        return false;

    }
}
