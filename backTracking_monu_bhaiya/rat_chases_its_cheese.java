package backTracking_monu_bhaiya;
import java.util.*;
public class rat_chases_its_cheese {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        String a;
        char [][] ch=new char[m][n];
        for(int i=0;i<m;i++) {
            a = s.next();
            for(int j=0;j<n;j++)
            {
                ch[i][j]=a.charAt(j);
            }
            }
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<ch[0].length;j++)
            {
                System.out.print(ch[i][j]+" ");
            }
            System.out.println();
        }
    }
}
