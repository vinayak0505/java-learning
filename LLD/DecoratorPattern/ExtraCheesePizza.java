package LLD.DecoratorPattern;

public class ExtraCheesePizza implements ExtraToppingsPizza {

    BasePizza pizza;

    public ExtraCheesePizza(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 10;
    }

    @Override
    public int getTime() {
        return pizza.getTime() + 10;
    }

    @Override
    public String getExtra() {
        if(pizza instanceof ExtraToppingsPizza){
            return ((ExtraToppingsPizza) pizza).getExtra() + ", Cheese";
        }
        return "Cheese";
    }
    
}
