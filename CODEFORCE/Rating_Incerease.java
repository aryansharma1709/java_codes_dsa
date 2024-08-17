package CODEFORCE;
import java.util.*;
public class Rating_Incerease {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            String str=s.next();
            check(str);
        }
    }
    public static void check(String str){

        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)!='0')
            {
                int  a=Integer.parseInt(str.substring(0,i));
                int b=Integer.parseInt(str.substring(i));
                if(b<=a)
                {
                    System.out.println("-1");
                    return ;
                }

                System.out.print(str.substring(0,i)+" ");
                System.out.println(str.substring(i));
                return;
            }

        }
        System.out.println("-1");
    }
}
