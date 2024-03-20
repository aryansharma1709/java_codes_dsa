package string;
//string is immuteable
// immuteable ka mtlb ye hota hai ki hum same location par change nhi kar skte hai usme first iski copy banegi tab change hoga .
// "=="  isme  address  basis par comapare hota hai
// hold string address karta hai but print ke time par value us address ki print karta hai kyuki pointer nhi hote jab mai print support nhi karta address printing me to isliye jab secure language maani jati hai

public class hello_string {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        String str3 = new String ("hello");
        String str4=new String("hello");
        System.out.println(str1==str3);
        System.out.println(str1==str2);
        System.out.println(str4==str3);
        System.out.println(str1);
        str2=str1+"bye";
        str1=str1+"bye";
        String a="ar"+"yan";
        String b="ar"+"yan";
        System.out.println(a==b);
//        only case jab string literal ko add karenge to usme ye hoga ki run time par "+" sign ko neglect kar deta hai
        System.out.println(str1==str2);
//        during concate or plus sign use to koi bhi string pool me bana hai uske kuch add kiya to uski copy bahar bane heap me tab usme kuch add hoga new keyword internally chal jata hai
    }
}
