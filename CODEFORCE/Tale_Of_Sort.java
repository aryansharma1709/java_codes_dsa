package CODEFORCE;
import java.util.*;
public class Tale_Of_Sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int []a= new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();
            }
            int c=check(a);
            System.out.println(c);
        }
    }
    public static int check(int []a){
        int c=a[0];
        int ans=0;
        for(int i=1;i<a.length;i++)
        {
            if(c<=a[i])
            {
                c=a[i];
            }
            else{
                ans=Math.max(ans,c);
            }

        }
        return ans;
    }
}
