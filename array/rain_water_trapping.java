package array;
import java.util.*;
public class rain_water_trapping {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        System.out.println(trapping(a));
    }
    public static int trapping(int []a)
    {
        int x=a.length;
        int [] left=new int[x];
        left[0]=a[0];
        for(int i=1;i<left.length;i++)
        {
            left[i]=Math.max(left[i-1],a[i]);
        }
        int []right=new int[x];
        right[x-1]=a[x-1];
        for(int i=x-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],a[i]);
        }
        int sum=0;
        for(int i=0;i<x;i++)
        {
            sum+=(Math.min(left[i],right[i])-a[i]);
        }

        return sum;
    }
}
