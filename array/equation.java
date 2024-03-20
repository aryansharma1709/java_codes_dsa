package array;
import java.util.*;
public class equation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int b=check(n,k);
        System.out.println(b);
    }
    public static int check(int n, int k)
    {
        int x=1;
        while(true)
        {
            long y=(long)Math.pow(x,k);
            if(y>n)
                return x-1;
            else if(y==n)
                return x;
            x++;
        }

    }
}
