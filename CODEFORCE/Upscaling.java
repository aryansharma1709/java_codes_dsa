package CODEFORCE;
import java.util.*;
public class Upscaling {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n =s.nextInt();
            pattern(n);
        }
    }
    public static void pattern(int n){

        for(int i=0;i<2*n;i++)
        {

            for(int j=0;j<2*n;j++)
            {
                if (((i / 2) + (j / 2)) % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }


            }

            System.out.println();

        }
    }
}
