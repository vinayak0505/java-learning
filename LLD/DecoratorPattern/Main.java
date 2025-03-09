package LLD.DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        ExtraToppingsPizza pizza = new ExtraCheesePizza(new ExtraCheesePizza(new BasePizzaImpl()));
        System.out.println(pizza.getPrice());
        System.out.println(pizza.getTime());
        System.out.println(pizza.getExtra());
    }
}
