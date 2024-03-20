//bubble sort,selection,insertion,merge,counting,heap,cycle,queue,dutch national algorithm
package array;
import java.util.*;
public class sorting {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] a = new int [n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        sort(a);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public static void sort(int [] a)
    {
        for(int turn=0;turn<a.length;turn++)
        {
            for(int i=0;i<a.length-turn-1;i++)
            {
                if(a[i]>a[i+1])
                {
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
    }

}
