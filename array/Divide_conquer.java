package array;
import java.util.*;
public class Divide_conquer {
    public static void main(String[] args) {
//        best,avg,worst case me iski complexity hoti hai O(nlogn)
//        space complexity iski O(n) hoti hai
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        int []ans=sort(a,0,a.length-1);
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");
    }
    public static int [] sort(int[] a,int s,int e)
    {
        if(s>=e)
        {
            int[]bs=new int[1];
            bs[0]=a[s];
            return bs;
        }
        int mid=(s+e)/2;
        int [] first=sort( a,s,mid);
        int [] end=sort(a,mid+1,e);
       return sortmerge(first,end);
    }
    public static int[] sortmerge(int[]a,int []b)
    {
        int i = 0;
        int j = 0;
        int c[] = new int[a.length+b.length];
        int k = 0;
        while (i < a.length&& j < b.length){
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }
        return c;
    }
}
