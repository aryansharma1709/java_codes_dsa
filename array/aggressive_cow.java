package array;
import java.util.*;
//isme jo binary search laga rhe hai wo sorted line par laga rhe hai na ki array par uske
public class aggressive_cow {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t= s.nextInt();
        int c=s.nextInt();
        int [] n=new int[t];
        for(int i=0;i<t;i++)
            n[i]=s.nextInt();
        Arrays.sort(n);
        int  start =1;
        int end=n[t-1]-n[0];
        int mid;
        int ans=0;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(sit_possible(mid,n,c)) {
                ans=mid;
                start = mid + 1;
            }
            else
                end=mid-1;
        }
        System.out.println(ans);
    }
    public static boolean sit_possible(int mid,int [] n,int c)
    {
      int pos =n[0];
      int b=1;
      for(int i=1;i<n.length;i++)
      {
          if(n[i]-pos>=mid)
          {
           b++;
           pos=n[i];
          }
          if(b==c)
              return true;
      }
      return false;
    }
}
