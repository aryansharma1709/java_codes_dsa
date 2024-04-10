package stack;
import java.util.*;
public class Stock_Span {
    public static void main(String[] args) {
        int n=6;
        int [] a={5,30,35 ,40,38,35};
        Stack<Integer> st=new Stack<>();
        int [] ans=new int[n];
        for (int i = 0; i < a.length; i++)
        {
                while (!st.isEmpty() && a[i] >=a[st.peek()])
                     st.pop();
                if (!st.isEmpty())
                {
                    ans[i] = i - st.peek();
                }
                else
                {
                    ans[i]=i+1;
                }
                st.push(i);

        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
