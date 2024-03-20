package backTracking_monu_bhaiya;
import java.util.*;
public class queen_comination {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int q=s.nextInt();
        boolean[] board=new boolean[n];
        combination(board,q,"",0,0);
    }
    public static void combination(boolean[] board,int q,String ans,int count,int j){

        if(q ==count)
        {
            System.out.println(ans);
            return;
        }
        for(int i=j;i< board.length;i++)
        {
            if(board[i]==false)
            {
                board[i]=true;
                combination(board,q,ans+"B"+i+"Q"+count,count+1,i+1);
                board[i]=false;
            }
        }
    }
}
