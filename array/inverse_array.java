package array;
import java.util.*;
public class inverse_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        inverse(a);

    }
    public static void inverse(int [] a)
    {  int temp=0;
        for(int i=0;i<a.length;i++)
        {
            temp=a[i];
            a[a[i]]=i;
            a[temp]=a[i];
            for (int x:a)
                System.out.print(x+" ");
            System.out.println();
        }

    }
}
