package Solid_Principal.Decoratorpattern;

public class main {
    public static void main(String[] args) {
        Basepizza Nishantpizza = new Extracheese(new Mushroom( new Veglight()));
        Basepizza Udaypizza = new Extracheese(new Mushroom( new Margherita()));


        System.out.println(Nishantpizza.cost());
        System.out.println(Udaypizza.cost());
    }
}
