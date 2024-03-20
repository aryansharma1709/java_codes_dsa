package recursion_monu_bhaiya;
import java.util.*;
public class lexico_counting {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();

     counting(n,0);
    }
    public static void counting(int n,int current)
    {
        if(current>n)
            return;

        System.out.print(current+" ");
        int i=0;
        if(current==0)
            i=1;
     for(;i<=9;i++)
     {
         counting(n,current*10+i);
     }
    }
}
