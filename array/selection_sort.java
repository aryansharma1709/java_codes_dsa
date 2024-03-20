package array;
import java.util.*;
public class selection_sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        selectionSort(a);
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
    public static void selectionSort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            int minpos=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[minpos]) {
                    minpos=j;
                }
            }
            int temp=a[i];
            a[i]=a[minpos];
            a[minpos]=temp;
        }
    }
}
