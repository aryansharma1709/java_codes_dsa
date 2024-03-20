package array;
import java.util.*;
public class counting_sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        countingSort(a);
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
    public static void countingSort(int[] a)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            max=Math.max(a[i],max);
        }
        int[] b= new int[max+1];
        for(int i=0;i<a.length;i++)
        {
            b[a[i]]++;
        }
        int j=0;
        for(int i=0;i<b.length;i++)
        {
            while(b[i]>0)
            {
                a[j]=i;
                b[i]--;
                j++;
            }
        }
    }


}
