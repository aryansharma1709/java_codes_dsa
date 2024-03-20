package array;
import java.util.*;
public class randomize_quick_sort {
    public static void main(String[] args) {
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
        Random rn=new Random();
        int r=rn.nextInt(e-s)+s;
        int t=a[r];
        a[r]=a[e];
        a[e]=t;
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
