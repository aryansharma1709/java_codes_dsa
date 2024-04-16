package stack;
import java.util.*;
public class dynamic_stack {
    public static void main(String[] args)throws Exception{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=i;
        check_my_dynamic_stack st=new check_my_dynamic_stack();
        for(int i:a)
            st.push(i);
        System.out.println(st.toString());
        }

}
