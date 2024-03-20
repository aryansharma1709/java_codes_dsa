package string;
import java.util.*;
public class CB_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
 System.out.println(countNumber(a));

    }
    public static int countNumber(String a)
    {
        boolean [] v =new boolean[a.length()];
        int c=0;
        for(int i=1;i<=a.length();i++) {

            for (int j = i; j <= a.length(); j++) {
                int b = j - i;
                String z=a.substring(b,j);
                if(isCBnumber(Long.parseLong(z)) && Isvisited(v,b,j-1)) {

                    c++;
                    for(int k=b;k<=j-1;k++)
                    {
                        v[k]=true;
                    }
                }
            }
        }
        return c;
    }
    public static boolean isCBnumber(long n)
    {

        if(n==0|| n==1)
            return false;
        int [] arr={2,3,5,7,11,17,19,23,29};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
                return true;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(n%arr[i]==0)
                return false;
        }
        return true;
    }
    public static boolean Isvisited(boolean[] v, int si, int ei)
    {
        for(int a=si;a<=ei;a++)
        {
            if(v[a]==true)
                return false;
        }
        return true;
    }
}
