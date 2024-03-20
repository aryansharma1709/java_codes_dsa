package array;
import java.util.*;
public class rotate_image {
    public static void main(String[] args) {

            Scanner s=new Scanner(System.in);
        int k=s.nextInt();
            int n=s.nextInt();
            int [] a= new int[n];

            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();
            }
            rotate(a,k);
            for(int x:a)
            {
                System.out.print(x+" ");
            }
        }
        public  static void rotate(int []a,int k)
        {
            k = k % a.length;
            for (int j = 1; j <= k; j++) {
                int item = a[a.length - 1];

                for (int i = a.length - 2; i >= 0; i--) {
                    a[i + 1] = a[i];
                }
                a[0] = item;
            }
        }
    }

