package CODEFORCE;
import java.util.*;
public class Cheap_travel {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(minimum(n,m,a,b));
    }
    public static int minimum(int n, int m ,int a,int b){
        int c=(n/m)*b+(n%m)*a;
        int cb= ((n+m-1)/m)*b;
        return Math.min(a*n ,Math.min(c,cb));

    }
}
