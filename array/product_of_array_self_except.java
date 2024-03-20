package array;
import java.util.*;
public class product_of_array_self_except {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        product(a);
        for (int i = 0; i < n; i++)
            System.out.print(a[i]);
    }
     public static int[] product(int []a)
    {
        int x=a.length;
        int [] left=new int[x];
       left[0]=1;
        for(int i=1;i<left.length;i++)
        {
            left[i]=left[i-1]*a[i-1];
        }
        int []right=new int[x];
        right[x-1]=1;
        for(int i=x-2;i>=0;i--)
        {
            right[i]=right[i+1]*a[i+1];
        }

        for(int i=0;i<x;i++)
        {
          a[i]=left[i]*right[i];
        }

        return a;
    }

}
