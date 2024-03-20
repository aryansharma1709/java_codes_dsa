package string;

import java.util.*;

public class sub_string {
    public static void main(String[] args)
    {
        String s="aryan";
        sub(s);
//        System.out.println(s.substring(2,5));
    }
    public static void sub(String s)
    {   String c="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++) {
                c += s.charAt(j);
                System.out.print(c);
                System.out.print("    ");
            }
            System.out.println();
            c="";
        }

    }
}
