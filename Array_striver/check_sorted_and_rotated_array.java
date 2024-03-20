package Array_striver;
import java.util.*;
public class check_sorted_and_rotated_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
           a[i]=s.nextInt();
        }
        System.out.println(check(a));
    }
        public static boolean check(int[] a) {
            int c=a[0];
            int b=0;
            int d=0;
            if(a.length==1)
                return true;
            for(int i=1;i<a.length;i++)
            {
                if(c>a[i])
                {
                    b=i-1;
                    d=1;
                    break;

                }
                c=a[i];
            }
            if(d!=0 && a[0]<a[a.length-1])
                return false;
            c=a[b+1];
            if(d!=0)
            {
                for(int i=b+2;i<a.length;i++)
                {
                    if(c>a[i])
                        return false;
                    c=a[i];
                }
            }

            return true;
        }

}
