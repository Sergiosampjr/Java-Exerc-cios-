package poojava;

public class Car {
    int year;
    String color;
   public Car(int year, String color){
        this.year = year;
        this.color = color;
   }
    void power(){
        System.out.println("Engine on.....");
    }
    void turn_off(){
        System.out.println("Engine off.....");
    }
    void speed_up(){
        System.out.println("ram raaaam raaaaaaaammmmmmmmmm raammmmmmmmm");
    }
}


