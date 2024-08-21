package CODEFORCE;
import java.util.*;
public class Cut_The_Triangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int a[][]= new int[3][2];
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<2;j++)
                    a[i][j]=s.nextInt();
            }
            if ((a[0][0]!=a[1][0] && a[1][0]!=a[2][0]  && a[0][0]!=a[2][0])||(a[0][1]!=a[1][1] && a[1][1]!=a[2][1] && a[0][1]!=a[2][1]))
            {
                System.out.println("YES");
            }

            else
            {
                System.out.println("NO");
            }
        }
    }

}
