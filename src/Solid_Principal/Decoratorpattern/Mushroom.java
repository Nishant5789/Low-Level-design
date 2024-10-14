package Solid_Principal.Decoratorpattern;

public class Mushroom extends ToppingDecorator{

    Basepizza basepizza;

    public Mushroom(Basepizza basepizza) {
        this.basepizza = basepizza;
    }

    @Override
    int cost() {
        return basepizza.cost()+15;
    }
}
