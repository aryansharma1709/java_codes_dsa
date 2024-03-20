package array;
import java.util.*;
public class quick_sort {
    public static void main(String[] args) {
//        quick worst case me time complexity O(n^2)
//        quick ki avg. andbest case me time complexity O(nlogn)
//        partition ke time jis bhi element ko hum sahi karte hai  uske baad remaining data bach
//        gya saara ka saara left me ya right me chala gya is karna se quick sort n^2 karta hai
//        kuch aesa karo ki iski kabhi n^2 jaye hi na to hum randomize Quick sort
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        sort(a,0,n-1);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public static void sort(int []a,int si,int ei)
    {
        if(si>=ei)
            return;
        int idx=partition(a,si,ei);
        sort(a,0,idx-1);
        sort(a,idx+1,ei);

    }
    public static int partition(int []a,int s,int e){
        int idx=s;
        for(int i=s;i<a.length;i++)
        {
            if(a[i]<a[e])
            {

                int temp=a[i];
                a[i]=a[idx];
                a[idx]=temp;
                idx++;
            }
        }
        int temp=a[idx];
        a[idx]=a[e];
        a[e]=temp;
        return idx;
    }
}
