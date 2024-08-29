package OOps;

import java.util.Arrays;
import java.util.Comparator;

public class Car_client {
    public static void main(String[] args) {
        car[] arr=new car[5];
        arr[0]=new car(200,10,"white");
        arr[1]=new car(1000,20,"black");
        arr[2]=new car(345,3,"yellow");
        arr[3]=new car(34,89,"red");
        arr[4]=new car(8907,6,"grey");

        Arrays.sort(arr, new Comparator<car>() {
            @Override
            public int compare(car o1, car o2) {
                return o1.price-o2.price;
            }
        });
        Display(arr);

    }
    public static <T extends Comparable<T>> void Sort(T []arr){
        for(int i=1;i< arr.length;i++){
            for(int j=0;j< arr.length-i;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0){
                    T temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void Display(car[] arr){
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
