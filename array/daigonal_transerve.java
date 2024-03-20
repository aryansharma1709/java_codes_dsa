package array;
import java.util.*;
public class daigonal_transerve {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int a[][]= new int[m][n];
        int ans[]=new int[n*m];
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=s.nextInt();
            }
        }
        int k=0;
        for(int i=0;i<(m+n-1);i++)
        {
            int r=0,c=0;
            if(i<m)
            {
                c=i;
            }
            else{
                c=m-1;
                r=i-m+1;

            }
            ArrayList<Integer> list=new ArrayList<>();
            while(r<n && c>=0)
            {
                list.add(a[r][c]);
                r++;
                c--;
            }
            if(i%2==0) {
                Collections.reverse(list);
            }
            for(int j=0;j<list.size();j++)
            {
                ans[k]=list.get(j);
                k++;
            }
        }
        for(int z:ans)
        {
            System.out.print(z+" ");
        }
    }
}
