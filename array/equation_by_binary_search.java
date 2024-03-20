package array;
import java.util.*;
public class equation_by_binary_search {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int b = checking( n, k);
        System.out.println(b);
    }
    public static int checking(int n,int k)
    {
        int start=0;
        int end=n;
        int check=0;
        while(start<=end)
        {
            int mid=(start+end)/2;
            long c=(long)Math.pow(mid,k);
            if(c<=n)
            {
                check=mid;
                start=mid+1;
            }
            else
                end=mid-1;
        }
        return check;
    }
}
