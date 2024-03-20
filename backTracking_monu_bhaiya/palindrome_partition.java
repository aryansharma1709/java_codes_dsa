package backTracking_monu_bhaiya;
import java.util.*;
public class palindrome_partition {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String ques=s.next();
        partition(ques ,"");
    }
    public static void partition(String ques,String ans)
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
             return;
        }
        for(int i=1;i<=ques.length();i++)
        {
            String ch = ques.substring(0, i);
            if (ispalindrome(ch))
            {
                partition(ques.substring(i), ans + ch + "|");
            }
        }
    }
    public static boolean ispalindrome(String n)
    {
        int i=0;
        int j=n.length()-1;
        while(i<j)
        {
            if(n.charAt(i)!=n.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
