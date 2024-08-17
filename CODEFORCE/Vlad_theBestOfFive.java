package CODEFORCE;
import java.util.*;
public class Vlad_theBestOfFive {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            String str=s.next();
            int c=0;
            int b=0;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='A')
                    c++;
                else
                    b++;
            }
            System.out.println(c>b? 'A':'B');
        }
    }
}
