package recursion_monu_bhaiya;
import java.util.*;
public class print_outcomes_coin_toss {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        print(n,"");
    }
    public static void print(int n,String b)
    {

        if(n==0)
        {
            System.out.println(b);
            return;
        }
            print(n-1,b+'H');
        print(n-1,b+'T');


    }
}
