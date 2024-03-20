package array;
import java.util.*;
public class              clockwise_sprial_array_print {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int [][] a= new int[m][n];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                a[i][j]=s.nextInt();
         int total=a.length*a[0].length;
         int c=0;
        int min_col=0;
        int min_row=0;
        int max_col=a[0].length-1;
        int max_row=a.length-1;
        while(c<total){
            for(int i=min_col;i<=max_col;i++) {
                System.out.print(a[min_row][i]+" ");
                c++;
            }
            min_row++;
            for(int i=min_row;i<=max_row && c<total;i++) {
                System.out.print(a[i][max_col]+" ");
                c++;
            }
            max_col--;
            for(int i=max_col;i>=min_col && c<total;i--) {
                System.out.print(a[max_row][i]+" ");
                c++;
            }
            max_row--;
            for(int i=max_row;i>=min_row && c<total;i--) {
                System.out.print(a[i][min_col]+" ");
                c++;
            }
            min_col++;

      }
    }
}
