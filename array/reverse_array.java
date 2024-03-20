package array;
import java.util.*;
public class reverse_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        reverse(a);
    }
    public static void reverse(int []a)
    {
        int i=0;
        int j=a.length-1;
        while(i<j)
        {
           int temp =a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        for(int x:a)
        {
            System.out.print(x+" ");
        }
    }
}
