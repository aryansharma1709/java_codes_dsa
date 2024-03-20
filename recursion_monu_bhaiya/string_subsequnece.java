package recursion_monu_bhaiya;
import java.util.*;
public class string_subsequnece {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        print(a,"");
    }
    public static void print(String a, String b)
    {
        if(a.length()==0)
        { System.out.println(b);
        return;
        }
        char ch= a.charAt(0);
        print(a.substring(1),b);
        print(a.substring(1),b+ch);
    }
}
