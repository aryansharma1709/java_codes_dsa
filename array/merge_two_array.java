package array;
import java.util.*;
public class merge_two_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        int m = s.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++)
            b[i] = s.nextInt();
        int i = 0;
        int j = 0;
        int c[] = new int[n + m];
        int k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while (j < m) {
            c[k] = b[j];
            j++;
        }
        while (i < n) {
            c[k] = a[i];
            i++;
        }
        for(int p=0;p<c.length;p++)
        {
            System.out.print(c[p]+" ");
        }
    }
}
