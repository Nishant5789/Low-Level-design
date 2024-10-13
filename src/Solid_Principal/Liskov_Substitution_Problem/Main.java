package Solid_Principal.Liskov_Substitution_Problem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> array = new ArrayList<>();
        array.add(new Motorcycle());
        array.add(new Twowheelar());
        array.add(new Bicycle());

        // here null is return so runtime code goes break
        for(Vehicle obj: array){
            System.out.println(obj.hasengine());
        }

    }
}