package backTracking_monu_bhaiya;
import java.util.*;
public class queen_placed_in_nth_place_in_n_position {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
//        no.of given position
        boolean [] board=new boolean[n];
        int q=s.nextInt();
//        no.of queen that are arrangement in n position

        arrangement(board,q,"",0);
//        count isme ye bta rha hai ki kitne queen baitha chuka hu me n position uska current count;

    }
    public static void arrangement(boolean [] board,int q,String ans,int count){

        if(q ==count)
        {
            System.out.println(ans);
            return;
        }

        for(int i=0;i<board.length;i++)
//        ye loop lagya hai  n postion kitni position hai
        {
            if(board[i]==false)
            {
                board[i]=true;
//                place queen true mark kar diya to
                arrangement(board,q,ans+"B"+i+"Q"+count,count+1);
                board[i]=false;
//                undo kiya queen ko
            }
        }
    }
}
