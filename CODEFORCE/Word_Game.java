package CODEFORCE;
import java.util.*;
public class Word_Game {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            HashMap<String,Integer> map=new HashMap<>();
            String[][] arr=new String[3][n];
            for(int i=0;i<3;i++) {

                for (int j = 0; j < n; j++) {
                    arr[i][j] = s.next();
                    map.put(arr[i][j], map.getOrDefault(arr[i][j], 0) + 1);
                }
            }
            for(int i=0;i<3;i++)
            {
                int person_points=0;
                for(int j=0;j<n;j++)
                {
                    if(map.get(arr[i][j])==1)
                        person_points+=3;
                    else if(map.get(arr[i][j])==2)
                        person_points+=1;
                }
                System.out.print(person_points+" ");
            }
            System.out.println();

        }
    }
}
