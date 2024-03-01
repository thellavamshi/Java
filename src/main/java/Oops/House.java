package Oops;

public class House {
    String Address;
    String Color;
    double Area;

    public void openDoor(){
        System.out.println("The door is opening");
    }
    public void closeDoor(){
        System.out.println("The door is closing");
    }

    public static void main(String[] args) {
        House house =  new House();
        house.closeDoor();
        house.openDoor();
    }
}
