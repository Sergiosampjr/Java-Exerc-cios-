package poojava;

public class Celta {
    public static void main(String args[]){
        Car celta = new Car(2013,"cinza");
        System.out.println("O ano do celta é " + celta.year );
        System.out.println("A cor do celta é " + celta.color);
        celta.speed_up();
        celta.power();
        celta.turn_off();
    }
}
