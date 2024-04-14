package stack;
import java.util.*;
//isme hum array fixed length ki se ek stack banayege iski length hum pehle se fixed rakhege
public class myStackFixed {
//    length of the array jitni length ka stack banana hai
    protected int capacity;
//    protect use isliye kiya hai uski iski subclass hi access kar paye is variable ko
//    aur ye protected wala capacity hai ye length of array hai jo hum stack implementation
//    ke liye hai mtlb ye vary kar skti hai during execution of program
    public static final int CAPACITY=10;
//    aur array ki length hai stack implementation ke liye ye constant hai (default) value jo hoti hai wo
    protected int[]st;
//    ye array hai intialize kar di
    protected int top=-1;
//    index of top of the stack -1 isliye intially stack empty hoga na
    public myStackFixed(){
        this(CAPACITY);
//        stack use default length of array
    }
    public myStackFixed(int cap){
        capacity=cap;
//        ye given length use karege array jo pass uhi hai
        st=new int[capacity];
    }
    public int size() {
        return (top + 1);
        //    stack ka size kya hai wo nikal liya isse
    }
public boolean isEmpty(){
        return (top<0);
//        stack khali hai ki bhara pta kar liya
}
public boolean isFull(){
        return size()==capacity;
//        full hai ki nhi stack hamara
}
public void push(int data)throws Exception{
        if(isFull())
            throw new Exception("bhar gya ree apun");

            st[++top] = data;
//        element  insert  stack me karne ke liye
}
public int peek() throws Exception
{
        if(isEmpty())
            throw new Exception("Stack khali hai ree");
        return st[top];
//        top element of stack ka janane ke liye
}
public int pop ()throws Exception{
        int data;
        if(isEmpty())
            throw new Exception("stack khali hai ree");
        data=st[top];
        st[top--]=Integer.MIN_VALUE;
        return data;
//        pop karne ke liye hai ye stack me se data
}
public String toString(){
        String s;
        s="[";
        if(size()>0)
            s+=st[0];
        if(size()>1)
        {
            for(int i=1;i<size();i++)
                s+=","+st[i];
        }
        return s+"]";
//        Stack ko print karne ke liye ek string ke form me top element end me aayega
//    aur iski time complexity O(n) hogi
}
}
