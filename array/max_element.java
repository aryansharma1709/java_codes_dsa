package array;
import java.util.*;
public class max_element {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] a= new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println(max(a));
    }
    public static int max(int []a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i])
                max = a[i];
        }
        return max;
    }
    public static int max1(int[] a) {
        int m = Integer.MIN_VALUE;// -2^31
        for (int i = 0; i < a.length; i++) {
            m = Math.max(a[i], m);
        }
        return m;
    }
}
