package DecoratorDesignpattern;

public class Main1 {

    public static void main(String [] arg){
        System.out.println("Main method");

        BasePizza basePizza=new Vegdelight();
        System.out.println(basePizza.cost());

        BasePizza basePizza1=new Mushroom(new Cheese(new Cheese(basePizza)));

        System.out.println(basePizza1.cost());
    }
}
