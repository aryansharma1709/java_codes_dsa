package CODEFORCE;
import java.util.*;
public class Grandfather_Dovlets_calculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int  b=s.nextInt();
        int [] seg={6,2,5,5,4,5,6,3,7,6};
        int ans=0;
        for(int i=a;i<=b;i++)
        {
            int r=i;
            while(r>0)
            {
                int dig=r%10;
                ans+=seg[dig];
                r/=10;
            }
            if(i==0)
            {
                ans+=seg[0];
            }
        }
        System.out.println(ans);
    }
}
