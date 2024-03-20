package recursion_monu_bhaiya;
import java.util.*;
public class String_permutation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        print(a,"");
    }
    public static void print(String a,String b)
    {
        if(a.length()==0)
        {
//            System.out.println();
            System.out.println(b);
            return;
        }
            for(int i=0;i<a.length();i++)
            {
                String s1=a.substring(0,i);
                String s2=a.substring(i+1);
                System.out.print(s1+"s1"+s2);
                System.out.println();
                print(s1+s2,b+a.charAt(i));
            }
    }
}
