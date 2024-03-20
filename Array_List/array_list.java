package Array_List;
import java.util.*;
public class array_list{
    public static void main(String[] args) {
//        isme primitive data type allow nhi hai
//        new ArrayList se internally array banta hai uss array ki by default size=0 and capcity=10
//        default capcity ko change kar skte hai by () me value change karke usme to jo parenthresis me rakhege to wo hi ho jayega default capcity
//        agar hum element store karte hai to ye array internally apna size change kar dega ek new array bana ke by (old capcity+old capcity/2)
//        jab array internally full ho jata hai tab wo 1.5 se grow hota hai
        ArrayList<Integer> a=new ArrayList<>();

        System.out.println(a);
//        10 jo ai wo primitve value hai to auto boxing wrapper class me daal rahe hai
      a.add(10);
      a.add(20);
      a.add(105);
//        isme complexity O(1);
      a.add(-10);
        System.out.println(a);
//      complexity is O(n) hoti hai if kisi index me karna hai toh
              a.add(1,3);
        System.out.println(a);
        System.out.println(a.size());
//        particular index par se pta karna hai kya hai uspar data to get() ka use karte hai
        System.out.println(a.get(2));
//        remove karne par uski complexity O(n) hai kyuki delete karke shift karega aur a.remove(2)deleted value dega
        System.out.println(a.remove(2));
        System.out.println(a);
//        set uski particular index par add kar dega aur uski length bhi increase nhi hogi replace ho jayegii value jo value array se replace hui hai wo value aayegi a.set(1,20) me
        System.out.println( a.set(1,20));
        System.out.println(a);
        for(int x:a)
        {
//            unboxing wrapper class ki value ko primitive me daal rhe hai isme
            System.out.print(x+" ");
        }
    }
}
