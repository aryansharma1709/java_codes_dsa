package array;
import java.util.*;
public class maximum_sum_of_subarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] a= new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
       int b= subarray(a);
       System.out.println(b);

    }
    public static int subarray(int [] a)
    {
        int sum = Integer.MIN_VALUE;
       for(int i=0;i<a.length;i++) {
           int x = 0;
           for (int j = i; j < a.length; j++) {
               x += a[j];
               if (sum < x)
                   sum = x;
           }
       }
       return sum;
    }
}
// subarray mtlb ki array ke first element se suru then without skip unke set banana hi subarray hota hai
