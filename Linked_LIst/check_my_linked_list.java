package Linked_LIst;
import java.util.*;
public class check_my_linked_list {
    public static void main(String[] args) throws Exception{
        Scanner s=new Scanner(System.in);
        LinkedList ll=new LinkedList();
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
            ll.addFirst(i);
        ll.Display();
       System.out.println( ll.getNode(2));
        ll.addLast(6);
        ll.addatindex(4,7);
        System.out.println(ll.getatindex(2));
        ll.Display();
        System.out.println(ll.removeFirst());
        ll.Display();
        System.out.println(ll.removeAtIndex(3));
        ll.Display();
    }
}
