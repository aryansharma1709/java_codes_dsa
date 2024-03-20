package array;
import java.util.*;
public class two_array {
    public static void main(String[] args) {
        int [][] a=new int[5][4];
        Scanner s=new Scanner(System.in);
        for(int i=0 ;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
                a[i][j]=s.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
                System.out.print(a[i][j]);
        }

    }
}
