package CODEFORCE;
import java.util.*;
public class Clock_conversion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            String str=s.next();
            String ans="";
            int c=Integer.parseInt(str.substring(0,2));
            if(c==0)
            {
                ans+="12"+str.substring(2)+" AM";
            }
            else if(c>12)
            {
                if(c-12<10)
                    ans+="0"+(c-12)+str.substring(2)+" PM";
                else
                    ans+=(c-12)+str.substring(2)+" PM";
            }
            else if(c==12)
            {
                ans+=str+" PM";
            }
            else {
                ans+=str+" AM";
            }
            System.out.println(ans);
        }
    }
}
