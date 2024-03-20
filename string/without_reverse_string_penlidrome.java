package string;
import java .util.*;
public class without_reverse_string_penlidrome {
    public static void main(String[] args) {
        String s1="nitin";
        System.out.print(check(s1));
    }
    public static boolean check(String s1)
    {

        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s1.charAt(s1.length()-1-i))
                return false;
        }
        return true;
    }
}
