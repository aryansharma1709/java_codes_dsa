package CODEFORCE;
import java.util.*;
public class Grass_Field {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n-->0)
        {
            int[][] arr=new int[2][2];
            for(int i=0;i<2;i++)
            {
                for(int j=0;j<2;j++)
                {
                    arr[i][j]=s.nextInt();
                }
            }
            int c=0;
            for(int i=0;i<2;i++)
            {
                for(int j=0;j<2;j++)
                {
                    if(arr[i][j]==1)
                        c++;
                }
            }
            if(c==0) System.out.println(0);
            else if(c==4) System.out.println(2);
            else System.out.println(1);
        }
    }
}
