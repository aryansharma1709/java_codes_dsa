package array;
import java.util.*;
public class kadanes_algorithim {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int b=kadanes_sum(a);
 System.out.println(b);
    }
    public static int kadanes_sum(int[] a)
    {
       int x=0;
       int sum=Integer.MIN_VALUE;
       for(int i=0;i<a.length;i++)
       {
           x+=a[i];
           sum=Math.max(sum,x);
           if(x<0)
               x=0;
       }
       return sum;
    }
}
