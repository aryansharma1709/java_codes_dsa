package stack;
import java.util.*;
public class check_my_stack_fixed {
    public static void main(String[] args)throws Exception{
        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
        myStackFixed p=new myStackFixed();
        p.push(20);
        p.push(30);
        p.push(50);
        p.push(60);
        p.push(80);
        p.push(90);
        p.push(100);
        p.push(10);
        p.push(70);
        p.push(40);
        System.out.println(p.isFull());

    }
}
