package LLD.StrategyDesignPattern.Vehical;

public class Car implements EngineVecal{

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public int getTireCount() {
        return 4;
    }

    @Override
    public int getEngine() {
        return 10;
    }

    @Override
    public String fuelType() {
       return "petrol";
    }
    
}
