package CODEFORCE;
import java.util.*;
public class Stair_peak_Niether {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int x=s.nextInt();
            int y=s.nextInt();
            int z=s.nextInt();
            if(x<y && y<z)
                System.out.println("STAIR");
            else if(x<y && y>z)
                System.out.println("PEAK");
            else
                System.out.println("NONE");
        }
    }
}
