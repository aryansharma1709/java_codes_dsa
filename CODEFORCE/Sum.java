package CODEFORCE;
import java.util.*;
public class Sum {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int t=s.nextInt();
            while(t-->0)
            {
                int x=s.nextInt();
                int y=s.nextInt();
                int z=s.nextInt();
                System.out.println((x+y==z || x+z==y || z+y==x)? "YES" : "NO");

            }
        }
}
