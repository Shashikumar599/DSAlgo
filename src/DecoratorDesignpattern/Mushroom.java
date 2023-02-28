package DecoratorDesignpattern;

public class Mushroom extends Toppings{

    public Mushroom(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    int cost() {
        return basePizza.cost()+10;
    }
}
