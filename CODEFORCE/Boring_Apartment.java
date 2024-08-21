package CODEFORCE;
import java.util.*;
public class Boring_Apartment {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int c=(int)Math.log10((double)n)+1;
            int rem=((n%10)-1)*10;
            if(c==1)
                System.out.println(rem+c);
            else if(c==2)
                System.out.println(rem+c+1);
            else if(c==3)
                System.out.println(rem+c+2+1);
            else
                System.out.println(rem+c+3+2+1);
        }
    }
}
