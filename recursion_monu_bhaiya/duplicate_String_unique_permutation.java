package recursion_monu_bhaiya;
import java.util.*;
public class duplicate_String_unique_permutation {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            String a=s.next();
            print(a,"");
        }
        public static void print(String a,String b)
        {
            if(a.length()==0)
            {

                System.out.println(b);
                return;
            }
            for(int i=0;i<a.length();i++)
            {
                char c=a.charAt(i);
                boolean value=false;
                for(int j=i+1;j<a.length();j++)
                {
                    if(c==a.charAt(j))
                    {
                        value=true;
                        break;
                    }
                }
                if(value==false) {
                    String s1 = a.substring(0, i);
                    String s2 = a.substring(i + 1);
                    print(s1 + s2, b + a.charAt(i));
                }
            }
        }
    }


