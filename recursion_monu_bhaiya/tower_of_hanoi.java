package recursion_monu_bhaiya;
import java.util.*;
public class tower_of_hanoi {
    public static void main(String[] args) {
//        three rod hoti  hai isme  a--(source rod),b--(help),c--(destination)
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
//        no. of disk in source rod
        String source="A";
        String help="B";
        String destination="C";
        move(n,source,help,destination);
    }
    public static void move(int n,String source,String help,String destination)
    {
        if(n==0)
            return;
        move(n-1,source,destination,help);
        System.out.println("move "+n+"th disk from"+source+"to"+destination);
        move(n-1,help,source,destination);
    }
}
