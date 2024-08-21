package CODEFORCE;
import java.util.*;
public class The_Good_Array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int k=s.nextInt();
            int c=calculate(n,k);
            System.out.println(c);
        }
    }
    public static int calculate(int n, int k) {
        int[] prefix = new int[n + 1];

        for (int i =1;i<=n;i++)
        {
            int num=(i+k-1)/k;
            prefix[i]=prefix[i-1];

            if (num>prefix[i])
            {
                prefix[i]++;
            }
        }
        int suffix = 0;
        for(int i=n; i>=1;i--)
        {
            int num = (i+k-1)/k;
            int available=prefix[n]-prefix[n-i]+suffix;
            if (available<num)
            {
                suffix++;
            }
        }

        return suffix + prefix[n];
    }
}
