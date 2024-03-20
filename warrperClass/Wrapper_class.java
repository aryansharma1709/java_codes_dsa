package warrperClass;
import com.sun.jdi.IntegerValue;

import java.util.*;
public class Wrapper_class {
    public static void main(String[] args) {

//        AUTO BOXING: primitive data ki value wrapper class me daal dete hai to stack se uth ke value  heap bhi me chali jati hai
        int b=8;
        Integer b1=b;
        System.out.println(b1);
//        UNBOXING: wrapper class ke data ko primitive class me bhi daalte hai to data heap se stack me aa jata hai
        Integer c=9;
        int c1=c;
        System.out.println(c1);
        //        address of this a is stored in stack and its value stored in heap
//        value of this b is stored in stack
        Integer a=10;
        int a1=10;
        System.out.println(a);
        System.out.println(a1);
// cache (cache  heap me hoti hai ) : integer ke liye cache use hoti hai jiski range -128 to 127 data hoga to uska duplication nhi banega to same address assign hoga
//    byte,integer cache, long cache, short cache;
        Integer e1=78;
        Integer e2=78;
        Integer e3=178;
        Integer e4=178;
        System.out.println(e1==e2);
        System.out.println(e3==e4);

    }
}
