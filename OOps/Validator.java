package OOps;

public class Validator {
    public String validate(int n){
        return "I am a number";
    }
    public String validate(String n){
        return "I am a String";
    }
    public String validate(int []n){
        return "I am a array";
    }

    public static void main(String[] args) {
        Validator v=new Validator();
        String t="hii";
        int n=-1;
        int[]p={-1};
        System.out.println(v.validate(t));
        System.out.println(v.validate(n));
        System.out.println(v.validate(p));

    }
}
