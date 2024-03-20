package array;
import java.util.*;
public class square_matrix_transpose {
    public static void main(String[] args) {
        int [][] a=new int[3][3];
        Scanner s=new Scanner(System.in);
        int temp=0;
        for(int i=0 ;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
                a[i][j]=s.nextInt();
        }
        for(int i=0;i<a.length;i++) {

            for (int j = i+1; j < a[0].length; j++) {

                    temp=a[i][j];
                  a[i][j]=a[j][i];
                  a[j][i]=temp;


            }
        }
        for(int i=0;i<a.length;i++) {

            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }
    }
}
