package backTracking_monu_bhaiya;
import java.util.*;
public class coin_permutation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int target_coin=s.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        coin_changes(a,target_coin,"");
    }
    public static void coin_changes(int[] a,int target_coin,String ans)
    {
        if(target_coin==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i< a.length;i++)
        {
            if(target_coin>=a[i])
            coin_changes(a,target_coin-a[i],ans+a[i]);
        }
    }
}
