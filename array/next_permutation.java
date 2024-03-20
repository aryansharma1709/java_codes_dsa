package array;
import java.util.*;
public class next_permutation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] a= new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        permutation(a);
        for (int x:a)
        System.out.print(x+" ");
    }
    public static void permutation(int[]a){
        int p=-1;
        for(int i=a.length-2;i>=0;i--)
        {
            if(a[i]<a[i+1]) {
                p = i;
                break;
            }
        }
        if(p==-1) {
            reverse(a, 0, a.length - 1);
            return;
        }
        int q=-1;
        for(int i=a.length-1;i>p;i--)
        {
            if(a[i]>a[p])
            {
                q=i;
                break;
            }
        }
        int temp=a[p];
        a[p]=a[q];
        a[q]=temp;
        reverse(a,p+1,a.length-1);

    }
    public static void reverse(int[] a,int start,int stop) {
        int i = start;
        int j = stop;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}
