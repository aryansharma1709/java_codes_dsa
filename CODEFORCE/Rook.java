package CODEFORCE;
import java.util.*;
public class Rook {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            String str=s.next();

            for(int i=1;i<=8;i++)
            {
                if(!str.equals(""+str.charAt(0)+i))
                    System.out.println(""+str.charAt(0)+i);
                if(!str.equals(""+((char)(96+i))+str.charAt(1)))
                    System.out.println(""+((char)(96+i))+str.charAt(1));
            }
        }
    }
}
