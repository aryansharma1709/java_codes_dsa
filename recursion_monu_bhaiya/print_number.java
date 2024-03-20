package recursion_monu_bhaiya;
import java.util.*;
public class print_number {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        print(n);
//        int a=1;
//       int b=pd(n,a);
    }
//    public static int pd(int n,int a)
//    {
//
//        if(a>n)
//            return a-1;
//        System.out.println(pd(n,a+1));
//        return a-1;
//    }
    public static void print(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        print(n-1);
    }
}
