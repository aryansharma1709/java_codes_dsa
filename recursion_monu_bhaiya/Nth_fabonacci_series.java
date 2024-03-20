package recursion_monu_bhaiya;
import java.util.*;
public class Nth_fabonacci_series {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(fabonacci(n));
    }
    public static int fabonacci(int n)
    {
        if(n==0 || n==1)
            return n;
        int f1=fabonacci(n-1);
        int f2=fabonacci(n-2);
        return f1+f2;
    }
}

