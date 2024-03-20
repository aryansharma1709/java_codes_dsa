package array;
import java.util.*;
public class pigeonholeprinciple {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int []a=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=s.nextInt();
       }
       int [] b=new int[n];
       int add=0;
       int sum=0;
       for(int i=0;i<n;i++)
       {
         add+=(a[i]);
         sum=add%n;

         b[sum]=b[sum]+1;
       }
       sum=0;
       for(int i=0;i<n;i++)
       {
//          if(b[i]>=2)
//              sum+=((i*(i-1))/2);
              System.out.println(b[i]);
       }
//        System.out.println(sum);
    }
}
