package string;
import java.util.*;
//...lexiographically compare string ...
public class compare_check {
    public static void main(String[] args) {
        String s1="aryan";
        String s2="ayushi";
        System.out.println(checkcompare(s1,s2));
    }
    public static int checkcompare(String s1, String s2)
    {
        int n=Math.min(s1.length(),s2.length());
                for(int i=0;i<s1.length();i++)
                    if(s1.charAt(i)!=s2.charAt(i))
                        return s1.charAt(i)-s2.charAt(i);


        return s1.length()-s2.length();
    }
}
