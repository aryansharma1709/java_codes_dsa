package CODEFORCE;
import java.util.*;
public class New_Year_Candles {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int i=a;
        int ans=a;
       while(i>=b && a>=b)
       {
           int rem=i/b;
           ans+=rem;
         i=(i/b)+(i%b);

       }
       System.out.println(ans);
    }
}
