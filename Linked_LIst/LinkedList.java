package Linked_LIst;

public class LinkedList {
    class Node{
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;
    public void addFirst(int item)
    {
        Node nn= new Node();
        nn.val=item;
        if(size==0)
        { head=nn;
            tail=nn;
         size++;
        }
        else{
            nn.next=head;
            head=nn;
            size++;
        }
    }
    public void addLast(int item){
        if(size==0)
            addFirst(item);
        else {
            Node nn = new Node();
            nn.val=item;
            tail.next=nn;
            tail=nn;
            size++;
        }
    }
    public void addatindex(int k,int item) throws Exception
    {
        if(k==0)
            addFirst(item);
        else if(k==size){
            addLast(item);
        }
        else {
            Node nn=new Node();
            nn.val=item;
            Node k_1th=getNode(k-1);
            nn.next=k_1th.next;
            k_1th.next=nn;
            size++;
        }
    }
    public int getFirst()
    {
        return head.val;
    }
    public int getLast(){
        return tail.val;
    }
    public int removeFirst(){
        Node temp=head;
        if(size==1){
            head=null;
            tail=null;
            size--;
        }
        else{
            head=head.next;
            temp.next=null;
            size--;
        }
        return temp.val;
    }
    public int removelast() throws Exception{
        if(size==1)
            return removeFirst();
        else{
            Node prev =getNode(size-2);
            int rv= tail.val;
            tail=prev;
            tail.next=null;
            size--;
            return rv;
        }
    }
    public int removeAtIndex(int k) throws Exception{
         if(k==0)
             return removeFirst();
         else if(k==size-1)
             return removelast();
         else{
            Node curr=getNode(k);
            Node prev=getNode(k-1);
            prev.next=curr.next;
            curr.next=null;
            return curr.val;
         }
    }
    public int getatindex(int k) throws Exception{
        return getNode(k).val;
    }
    public Node getNode(int k) throws Exception
    {
        if(k<0 || k>=size)
        {
            throw new Exception("k range me nhi hai rreeeee");
        }
        Node temp=head;
        for(int i=0;i<k;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void Display(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println();
    }
}
