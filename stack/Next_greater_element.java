package stack;
import java.util.*;
public class Next_greater_element {
//    time complexity is O(n)
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0) {
            int n = s.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++)
                a[i]=s.nextInt();
            negative(a);
            t--;
        }
    }
    public  static  void negative(int[]a)
    {
        int []ans=new int[a.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<a.length;i++) {
          while(!st.isEmpty() && a[i]>a[st.peek()])
          {
              ans[st.pop()]=a[i];
          }
          st.push(i);
        }
        while(!st.isEmpty())
        {
            ans[st.pop()]=-1;
        }
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(a[i]+" "+ans[i]);
        }
    }
}
