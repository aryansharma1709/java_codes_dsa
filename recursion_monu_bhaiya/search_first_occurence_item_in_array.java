package recursion_monu_bhaiya;
import java.util.*;
public class search_first_occurence_item_in_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=s.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        int i=0;
        System.out.println(search(i,a,t));
    }
    public static int search(int i,int [] a,int t)
    {
        if(a[i]==t)
            return i;
        else if(i==a.length-1)
            return -1;
        return search(i+1,a,t);
    }
}
