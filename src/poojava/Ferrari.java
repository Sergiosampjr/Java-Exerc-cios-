package poojava;

public class Ferrari {
   public static void main(String args []){
        Car ferrari = new Car(2009,"red");
        ferrari.year = 2009;
        ferrari.color = "Red";
       System.out.println("Car:ferrari");
       System.out.println("The year old in the car " + ferrari.year);
       System.out.println("The color in the car is "+ ferrari.color);
       ferrari.power();
       ferrari.speed_up();
       ferrari.turn_off();
   }}

