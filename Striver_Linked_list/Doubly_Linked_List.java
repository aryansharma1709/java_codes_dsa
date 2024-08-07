package Striver_Linked_list;
class Nodes{
    int data;
    Nodes next;
    Nodes back;
    Nodes(int data1 ,Nodes next1,Nodes back1)
    {
        this.data=data1;
        this.next=next1;
        this.back=back1;
    }
}
public class Doubly_Linked_List {
    private static void print(Nodes head){
     while(head!=null){
         System.out.println(head.data);
         head=head.next;
     }

    }
    private static Nodes convertArr2Dll(int[] arr){
        Nodes head =new Nodes(arr[0] ,null ,null);
        Nodes prev= head;

        for(int i=1;i<arr.length;i++)
        {
            Nodes temp= new Nodes(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60};
        Nodes head=convertArr2Dll(arr);
       print(head);
    }
}
