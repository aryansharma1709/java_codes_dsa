package array;
import java.util.*;
public class linear_Search {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] a=new int[n];
        int item=s.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println(search(a,item));
    }
    public static int search(int []a,int item)
    {
        for(int i=0;i<a.length;i++)
        {
         if(a[i]==item) return i;
        }
        return -1;
    }
}
