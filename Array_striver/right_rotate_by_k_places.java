package Array_striver;
import java.util.*;
public class right_rotate_by_k_places {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int k=s.nextInt();
      int n=s.nextInt();
      int []a=new int[n];
      for(int i=0;i<n;i++)
          a[i]=s.nextInt();
       k=k%n;
       reverse(0,n-k-1,a);
       reverse(n-k,n-1,a);
       reverse(0,n-1,a);
       for(int x:a)
       {
           System.out.print(x+" ");
       }
    }
    public static void reverse(int i,int f,int []a)
    {
        while(i<=f)
        {
            int temp=a[i];
            a[i]=a[f];
            a[f]=temp;
            i++;
            f--;
        }
    }
}
