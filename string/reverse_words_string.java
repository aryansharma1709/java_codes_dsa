package string;
import java.util.*;
public class reverse_words_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        s=s.trim();
        String b="";
        String [] a=s.split("\s+");
        for(int i=a.length-1;i>=0;i--)
        {
            b+=a[i]+" ";
        }
        b=b.trim();
        System.out.println(b);
    }
}
