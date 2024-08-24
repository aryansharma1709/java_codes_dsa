package CODEFORCE;
import java.util.*;
public class Chewbacca_Number {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        long sum=0;
        long rem=0;
        long b=1;
        long c=n;
        while(n>0)
        {
            rem=n%10;
            if(n==9)
                sum+=(rem*b);
            else if(rem>=(9-rem))
                sum+=((9-rem)*b);
            else
                sum+=(rem*b);
            n/=10;
            b*=10;
        }

        if(c<sum)
            System.out.println(c);
        else if(c==0)
            System.out.println("9");
        else
            System.out.println(sum);
    }
}
