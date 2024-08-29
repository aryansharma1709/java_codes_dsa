package OOps;

public class car {
    int price;
    int speed;
    String color;
    public car(){

    }
    public car(int price,int speed,String color){
        this.price=price;
        this.speed=speed;
        this.color=color;
    }
    public String toString(){
        return "P "+price+" s "+speed+" c "+color;
    }
    public int compareTo(car o){
        return this.price-o.price;
    }
}
