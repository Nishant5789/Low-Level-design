package Solid_Principal.WIthStrategyPattern;

public class Vehicle {
    Drivestrategy driveObject;
    // this is know as construciton injection
    public Vehicle(Drivestrategy driveObject) {
        this.driveObject = driveObject;
    }
    void drive(){
        driveObject.drive();
    }
}
