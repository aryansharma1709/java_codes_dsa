package CODEFORCE;
import java.util.*;
public class Happy_birthday_PolyCrap_1227A {


        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int t=s.nextInt();
            while(t-->0)
            {
                int n=s.nextInt();
                System.out.println(birthday(n));
            }
        }
        public static long birthday(int n){
            if(n<=9)
                return n;
            int d=(int)Math.log10(n);
            long sum=d*9;
            long c=intial(d);
            long  e=c;
            while(e<=n)
            {
                sum++;
                e=e+c;
            }
            return sum;

        }
        public static long intial(int n)
        {
            long c=1;
            for(int i=0;i<n;i++)
            {
                c=c*10+1;
            }
            return c;
        }
    }


