package string;
import java.util.*;
public class string_method {
    public static void main(String[] args) {
        String s="Hellobyeok";
        System.out.println(s.length());
        System.out.println(s.charAt(5));
        String s1="hello";
        String s2=new String ("hel");
//        System.out.println(s1.equals(s2));
       System.out.println( checkequal(s1,s2));

    }
    public static boolean checkequal(String s1,String s2) {
        if (s1 == s2) {

            return true;
        }
        {
            if (s1.length() != s2.length())

            return false;
        }
        for (int i = 0; i < s1.length(); i++)
      if(s1.charAt(i)!=s2.charAt(i))
      {
          return false;
      }

         return true;
    }

}
