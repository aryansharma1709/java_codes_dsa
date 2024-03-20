package recursion_monu_bhaiya;
import java.util.*;
public class sum_of_natural_no {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       int n=s.nextInt();
        System.out.println(sum(n));
    }
    public static long sum(int n)
    {
        if(n==1)
            return 1;
        return n+sum(n-1);
    }
}
