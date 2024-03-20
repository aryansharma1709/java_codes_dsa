package recursion_monu_bhaiya;
import java.util.*;
public class print_increasing {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        pi(n);
    }
    public static void pi(int n)
    {
         if(n==0)
          return;
        pi(n-1);
        System.out.println(n);

    }
}
