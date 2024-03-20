package random;
import java.util.*;
public class Random_No_Generate {
    public static void main(String[] args) {
        int start=10;
        int end=100;
        Random rn=new Random();
        for(int i=0;i<10;i++)
        {
            int val=rn.nextInt(end-start+1)+start;
            System.out.print(val+" ");
        }
    }
}
