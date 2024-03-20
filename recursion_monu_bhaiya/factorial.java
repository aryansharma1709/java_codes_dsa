package recursion_monu_bhaiya;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        long s=1;
        System.out.println(fac(a,s));
    }
//    BY TAIL RECURSION (ISKA MTLB HOTA HAI KI RETURN CALL USKE BAAD KOI LINE NHI CHALE )
    public static long fac(int a ,long s)
    {

       if(a==1)
       {
           return s;
       }
       s*=a;
       System.out.println(s);
    return   fac(a-1,s);

    }
//    by HEAD RECURSION(TAIL KO CHHOD KE SAARE HEAD RECURSION)
//    public static int fac(int a)
//    {
//        int sum=0;
//        if(a==1)
//            return 1;
//        sum=a*fac(a-1);
//        return sum;
//    }
}
