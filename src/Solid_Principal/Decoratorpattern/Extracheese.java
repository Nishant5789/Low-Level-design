package Solid_Principal.Decoratorpattern;

public class Extracheese extends ToppingDecorator{

    Basepizza basepizza;

    public Extracheese(Basepizza basepizza) {
        this.basepizza = basepizza;
    }

    @Override
    int cost() {
        return basepizza.cost()+10;
    }
}
