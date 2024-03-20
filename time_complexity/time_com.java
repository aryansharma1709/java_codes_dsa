package time_complexity;
import java.util.*;
public class time_com {
    public static void main(String[] args) {
        long start =System.currentTimeMillis();
        for(int i=0;i<1000_000;i++)
        {

        }
        long end =System.currentTimeMillis();
        System.out.println(end-start);
    }
}
// YE EXPERIMENTAL WAY HAI PAR ISSE TIME COMPLEXITY  NHI NIKALTE KYUKI YE HARDWARE PAR DEPEND KARTI HAI
//INSERTION SORT:
//        best case of insertion sort O(n)
//        best case bo hoga jab array already sort
//        --isme inner loop chalta hi nhi hai ---

//Question
//        Bubble sort ,insertion sort and selection sort no. of swapping ke basis par kon better hai ?- insertion sort better hota hai (n-1) hotoi hai swapping