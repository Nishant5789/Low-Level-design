package Solid_Principal.WIthStrategyPattern;

public class main {
    public static void main(String[] args) {

        Vehicle Sportvehicleobject = new SportVehicle(new SpecialStrategydrive());
        Vehicle Passengervehicleobject = new SportVehicle(new SpecialStrategydrive());
        Vehicle Byroadvehicleobject = new SportVehicle(new NormalStrategyDrive());

        Sportvehicleobject.drive();
        Byroadvehicleobject.drive();
        Passengervehicleobject.drive();
    }
}
