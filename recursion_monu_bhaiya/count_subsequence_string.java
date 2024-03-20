package recursion_monu_bhaiya;
import java.util.*;
public class count_subsequence_string {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        System.out.println(count(a,""));
    }
//    ek tareek hai  static value bana lo usko base condtion me laga do to wo count kar dega
//    static int c =0;
    public static int count(String a, String b)
    {
        if(a.length()==0)
        { System.out.println(b);
//            c++;
            return 1;
        }
        char ch= a.charAt(0);
      int x = count(a.substring(1),b);
        int y=count(a.substring(1),b+ch);
        return x+y;
    }
    }

