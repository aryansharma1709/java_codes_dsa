package recursion_monu_bhaiya;
import java.util.*;
public class unique_matrix_outcome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        possible(m,n,1,1,"");
    }
    public static void possible(int m, int n, int h, int v, String ans)
    {
        if(m==v && n==h )
        {
            System.out.println(ans);
            return;
        }
        if(v>m || h>n)
            return;
        possible(m,n,h,v+1,ans+"V");
        possible(m,n,h+1,v,ans+"H");
    }
    }

