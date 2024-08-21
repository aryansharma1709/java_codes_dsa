package CODEFORCE;
import java.util.*;
public class Where_The_Bishop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            char a[][]=new char[8][8];
            for(int i=0;i<8;i++)
            {
                String line = s.next();
                for(int j=0;j<8;j++)
                {
                    a[i][j] = line.charAt(j);
                }
            }

            Bishop(a);
        }
    }

    public static void Bishop(char [][]a)
    {
        for(int i=1;i<7;i++)
        {
            for(int j=1;j<7;j++)
            {

                if(a[i][j]=='#' && a[i+1][j+1]=='#' && a[i-1][j-1]=='#' && a[i-1][j+1]=='#' && a[i+1][j-1]=='#')
                {
                    System.out.println((i+1) + " " + (j+1));
                    return ;
                }

            }
        }
    }
}
