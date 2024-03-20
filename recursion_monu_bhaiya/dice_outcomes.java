package recursion_monu_bhaiya;
import java.util.*;
public class dice_outcomes {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
//        n is the distance hai jispar pahuchna hai
        int m=s.nextInt();
//        m is the face of dice
        totaloutcome(n,0,m,"");
    }
    public static void totaloutcome(int n,int current,int m,String ans)
    {
        if(current==n)
        {
            System.out.println(ans);
            return;
        }
        if(current>n)
            return;
        for(int dice=1;dice<=m;dice++)
        {
            totaloutcome(n,current+dice,m,ans+dice);
        }
//        totaloutcome(n,current+1,ans+1);
//        totaloutcome(n,current+2,ans+2);
//        totaloutcome(n,current+3,ans+3);
    }
}
