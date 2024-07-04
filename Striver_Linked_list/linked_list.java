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
        if(arr.length==0)
            return null;
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
//--------------------------------Insert head in linked list-------------------------------
    private static node insertHead(node head,int val)
    {
      node temp =new node(val);
      temp.next=head;
      return temp;
    }
//-----------------------------------------------------------------------------------
//------------------------------Insert at the Last----------------------------------
    private static node insertLast(node head,int val)
    {
        if(head==null)
            return new node(val);
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        node last=new node(val);
        temp.next=last;
        return head;
    }
//----------------------------------------------------------------------------------
//-----------------------Insert element at kth position----------------------------
    private static node insert_Kth_position(node head, int val,int k)
    {
        if(head==null)
        {
            if(k==1)
                return new node(val);
            else
                return null;
        }
        else if (k==1)
        {
            return insertHead(head,val);
        }
        else if(k>lengthNode(head))
            return null;
//        else if(k==lengthNode(head))
//            return insertLast(head,val);
        node temp= head;
        k=k-2;
      while(k-->0)
      {
          temp=temp.next;
      }
      node ele=new node(val);
        ele.next=temp.next;
      temp.next=ele;
      return head;
    }
//---------------------------------------------------------------------------------
//------------------------------MAIN-----------------------------------------------------
    public static void main(String[] args) {
     int [] arr={10,20,30,40,50,60};
     node head=convertArr2ll(arr);
//     System.out.println(head.data);
//        head=removeHead(head);
//     System.out.println(head.data);
//     System.out.println(lengthNode(head));
//        head=removeTail(head);
//        head=delete_kth_element(head,4);
//        head=delete_by_value(head,3);
//          head=insertHead(head,100);
//         AGAR ME KARNA CHAHU KI MERA DIRECT HEAD INSERTHO JAYE TO EK METHODS YE HAI
//         node preHead=head;
//         head =new node(100);
//           head.next=preHead;
//        Last me insert kar ho to
//        head= insertLast(head,20);
//        Kth POSITION PAR ELEMENT INSERTION
        head=insert_Kth_position(head,70,3);
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
