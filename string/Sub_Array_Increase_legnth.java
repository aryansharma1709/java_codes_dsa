package string;
import java.util.*;
public class Sub_Array_Increase_legnth {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a= s.next();
        sub_array(a);
    }
    public static void sub_array(String a)

    {
        for(int l=1;l<=a.length();l++)
        {
            for(int j=l;j<=a.length();j++)
            {
                int i=j-l;
                System.out.print(a.substring(i,j)+" ");
            }
        }
    }
}
                      ///////------ APPROACH--------by---MONU BHAIYA-----------////////
// ye tha ki jo sub_array banani hai string ki uske liye pehle hum uski range check karni padegii jisse hum pta lag  ske ki
// flow kaisa hai  then ek loop to lagega length ka ek j ka j me aesa hoga ki jaha length hai to waha se j start ho rha hai then
//i ka humne observe kiya ki usse hume pta chal ki i= j-len ka jo hai bo hi i ki value ko satisfy kar rha hai ye
