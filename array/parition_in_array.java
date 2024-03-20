package array;
import java.util.*;
public class parition_in_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
          a[i]=s.nextInt();
//        int index=s.nextInt();
//        swipe(a,index);
     int ans=   partition(a,0,a.length-1);
     for(int i=0;i<n;i++)
     {
         System.out.print(a[i]+" ");
     }
     System.out.println();
     System.out.print(ans);
    }
//    public static void swipe(int []a,int index)
//    {
//        int temp= a[index-1];
//        a[index-1]=a[a.length-1];
//        a[a.length-1]=temp;
//    }
    public static int partition(int []a,int s,int e){
        int idx=0;
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
