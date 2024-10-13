package Solid_Principal.WIthoutStrategyPattern;

public class SportVehicle extends Vehicle{
    @Override

//    duplicate code
    void drive() {
        System.out.println("special driving");
    }
}
