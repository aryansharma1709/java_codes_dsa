package recursion_monu_bhaiya;
import java.util.*;
public class print_outcomes_without_two_head_toss_coin {

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
            if( b.length()==0 || b.charAt(b.length()-1)!='H' )
                print(n-1,b+'H');
            print(n-1,b+'T');


        }
    }


