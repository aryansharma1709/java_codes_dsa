package recursion_monu_bhaiya;
import java.util.*;
public class power {
    public static void main(String[] args) {

            Scanner s=new Scanner(System.in);
            int a=s.nextInt();
            int b=s.nextInt();
            System.out.println(pow(a,b));
        }
            public static long pow(int a, int b)
            {
                if(b==1)
                    return a;
                long s=pow(a,b-1);
                return a*s;
            }
        }


