package array;
import java.util.*;
public class vertical_wave_print_2d_array {
    public static void main(String[] args) {
        int [][] a=new int[3][4];
        Scanner s=new Scanner(System.in);
        int c=0;
        for(int i=0 ;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
                a[i][j]=s.nextInt();
        }
        for(int i=0;i<a[0].length;i++)
        {

            for(int j=0;j<a.length;j++)
            {
                if(i%2==0) {
                    System.out.print(a[c][i] + " ");
                    c++;
                }
                else{
                    c--;
                    System.out.print(a[c][i] + " ");

                }

            }

        }
    }
}
