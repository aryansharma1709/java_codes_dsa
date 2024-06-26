package Striver_Linked_list;
class node{
    int data;
    node next;
    node(int data1)
    {
        this.data=data1;
        this.next=null;
    }
}
public class linked_list {
    private static node convertArr2ll(int []arr){
        node head=new node(arr[0]);
        node mover=head;
//        System.out.println(mover);
        for(int i=1;i<arr.length;i++)
        {
            node temp=new node(arr[i]);
            mover.next=temp;
            mover=temp;
//            System.out.println(mover);
        }
        return head;
    }
    private static int lengthNode(node head)
    {
        int count=0;
        node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
    return count;
    }
 private static boolean elementPresnt(node head,int val){
     node temp=head;
     while(temp!=null)
     {
         if(temp.data==val)return true;
         temp=temp.next;

     }
     return false;
 }

    public static void main(String[] args) {
     int [] arr={12,5,6,3,4};
     node head=convertArr2ll(arr);
//     System.out.println(head.next);
     System.out.println(lengthNode(head));
     node temp=head;
     System.out.println(elementPresnt(head,15));
     while(temp!=null)
     {
//         System.out.println(temp.data);
         temp=temp.next;
     }
    }
}
