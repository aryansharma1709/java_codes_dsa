package recursion_monu_bhaiya;
import java.util.*;
public class generate_parentheses {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        parentheses(n,0,0,"");
    }
    public static void parentheses(int n,int open,int close,String ans)
    {
        if(open==n && close==n)
        {
            System.out.println(ans);
            return;
        }
        if(open>n || close>open)
        {
            return;
        }
        parentheses(n,open+1,close,ans+"(");
        parentheses(n,open,close+1,ans+")");
    }
}
