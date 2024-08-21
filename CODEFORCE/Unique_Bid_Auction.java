package CODEFORCE;
import  java.util.*;
public class Unique_Bid_Auction {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=s.nextInt();
            int c=auction(a);
            if(c==-1)
                System.out.println(-1);
            else
                System.out.println(c+1);
        }
    }
    public static int auction(int []a)
    {
        Map<Integer,Integer> m= new HashMap<>();
        for(int i:a)
        {
            m.put(i,m.getOrDefault(i, 0) + 1);
        }
        int min=Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            if(e.getValue()==1)
            {
                min=Math.min(min,e.getKey());
            }
        }
        if(min==Integer.MAX_VALUE)
            return -1;
        for(int i=0;i<a.length;i++)
        {
            if(min==a[i])
                return i;
        }
        return -1;
    }
}
