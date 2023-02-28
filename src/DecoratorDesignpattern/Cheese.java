package DecoratorDesignpattern;

public class Cheese extends Toppings{

    public Cheese(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    int cost() {
        return basePizza.cost()+20;
    }
}
