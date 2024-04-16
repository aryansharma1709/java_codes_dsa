package stack;

public class check_my_dynamic_stack {
//    array ki length use karenge stack ke liye
    protected int capacity;
//    defaukt capacity
    public static final int CAPACITY=16;
    public static int MINCAPACITY=1<<15;
//    iss line ka mtlb ye hai ye 2^15 iski minimum capcity defualt value 16 se start hogi
    protected int[] st;
    protected int top=-1;
    public check_my_dynamic_stack(){
        this(CAPACITY);
//        isse stack array of default length use kar sakega
    }
    public check_my_dynamic_stack(int cap){
        capacity=cap;
        st=new int[capacity];
    }
    public int size(){
        return (top+1);
    }
    public boolean isEmpty(){
        return (top<0);
    }

    public void push(int data) throws Exception{
          if(size()==capacity)
              expand();
          st[++top]=data;
    }
    private void expand(){
//        agar stack ka size full ho jaye to expand kar do
        int length=size();
        int []new_st=new int[length<<1];
        System.arraycopy(st,0,new_st,0,length);
        st=new_st;
        this.capacity=this.capacity<<1;
    }
    private void shrink(){
        int length=top+1;
        if(length<=MINCAPACITY || top<<2>=length)
            return ;
        length=length+(top<<1);
        if(top<MINCAPACITY)length=MINCAPACITY;
        int [] new_st=new int[length];
        System.arraycopy(st,0,new_st,0,top+1);
        st=new_st;
        this.capacity=length;
    }
 public int top() throws Exception{
        if((isEmpty()))
            throw new Exception("stack khali hai reee");
        return st[top];
 }
 public int pop() throws Exception{
        int data;
        if(isEmpty())
            throw new Exception("stack khali hai reee");
        data =st[top];
        st[top--]=Integer.MIN_VALUE;
        shrink();
        return data;
 }
    public String toString() {
        String s;
        s = "[";
        if (size() > 0)
            s += st[0];
        if (size() > 1)
            for (int i = 1; i <= size() - 1; i++) {
                s += ", " + st[i];
            }
        return s + "]";
    }
}
