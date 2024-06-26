package Striver_Linked_list;
//--------------------------------------------------------------------------------------
class node{
    int data;
    node next;
    node(int data1)
    {
        this.data=data1;
        this.next=null;
    }
}
//----------------------------------------------------------------------------------------------------------
public class linked_list {
//-----------------convert the array into linkedlist-------------------------
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
//------------------------------------------------------------------------------------------

//----------------length of the linked List-----------------------------------------
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
//-------------------------------------------------------------------------------

//---------------------------element present or not in the linked list-----------------------------
 private static boolean elementPresnt(node head,int val){
     node temp=head;
     while(temp!=null)
     {
         if(temp.data==val)return true;
         temp=temp.next;

     }
     return false;
 }
// ----------------------------------------------------------------------------

//----------------------------remove the head of the linked list--------------------
 private static node removeHead(node head)
 {
     if(head==null)return head;
     head=head.next;
     return head;
 }
// ----------------------------------------------------------------------------

//------------------------remove the tail of the linked list-------------------------------
 private static node removeTail(node head)
 {
     if(head==null || head.next==null)
     {
         return null;
     }
     node temp=head;
     while(temp.next.next!=null)
     {
         temp=temp.next;
     }
     temp.next=null;
     return head;
 }
// ---------------------------------------------------------------------------------------------

//-----------------------------------delete the kth element of the linked list--------------------
    private static  node delete_kth_element(node head,int k)
    {
       if(k==1) return removeHead(head);
       else if(k==lengthNode(head)) return removeTail(head);
       else if(k>lengthNode(head)) return head;

           int c=1;
           node temp=head;
           while(c<k-1)
           {
               temp=temp.next;
               c++;
           }
           temp.next=temp.next.next;
      return head;
    }
// -----------------------------------------------------------------------------------------------------

//-----------------------------------element deleted by its values---------------------------
    private static node delete_by_value(node head ,int val)
    {
       if(head==null)return head;
        else if(head.data==val)return head;
        node temp=head;
        node prev=null;
        while(temp!=null) {
            if (temp.data == val && temp.next == null) {
                prev.next = null;
                break;
            } else if (temp.data == val) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
//------------------------------------------------------------------------------------------
//------------------------------MAIN-----------------------------------------------------
    public static void main(String[] args) {
     int [] arr={12,5,6,3,4};
     node head=convertArr2ll(arr);
//     System.out.println(head.data);
//        head=removeHead(head);
//     System.out.println(head.data);
//     System.out.println(lengthNode(head));
//        head=removeTail(head);
//        head=delete_kth_element(head,4);
//        head=delete_by_value(head,3);
       node temp=head;
//     System.out.println(elementPresnt(head,15));
     while(temp!=null)
     {
         System.out.println(temp.data);
         temp=temp.next;
     }
    }
//---------------------------------------------------------------------
}
