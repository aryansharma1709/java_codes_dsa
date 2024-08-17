package CODEFORCE;
import java.util.*;
public class Immortal_Knight {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();

        while (t-->0)
        {
            int n=s.nextInt();
            int m=s.nextInt();

            if (Math.max(n, m)==3)
            {
                if(Math.min(n, m)==1)
                {
                    System.out.println("1 1");
                }
                else
                {
                    System.out.println("2 2");
                }
            }
            else
            {
                System.out.println("1 1");
            }
        }
    }
}
