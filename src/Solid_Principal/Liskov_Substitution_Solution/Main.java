package Solid_Principal.Liskov_Substitution_Solution;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> array = new ArrayList<>();
        array.add(new Motorcycle());
        array.add(new Twowheelar());
        array.add(new Bicycle());

        for(Vehicle obj: array){
            System.out.println(obj.getvehiclewheels());
        }

//        here code break at compile time avoid code breaking during run time
//        for(Vehicle obj: array){
//            System.out.println(obj.hasengine());
//        }

    }
}