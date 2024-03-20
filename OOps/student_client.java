package OOps;

public class student_client {
    public static void main(String[] args) {
        student s=new student();
        System.out.println(s.name);
        System.out.println(s.age);
        s.name="apne baap se kabhi uska naam nhi puchte betaaaa";
        s.age=18;
        s.karname="mera man jo karega me wohi karungi chhoti moti gadi me nhi baithugi ";
        s.intro_yourself();
    }
}
