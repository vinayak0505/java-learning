package LLD.StrategyDesignPattern.User;

import LLD.StrategyDesignPattern.Vehical.EngineVecal;

public class RichUser extends User{

    final EngineVecal vehical;
    public RichUser(EngineVecal vehical) {
        super(vehical);
        this.vehical = vehical;
    }

    public int putFuel() {
        if(vehical.fuelType() == "pertrol") {
            return 100;
        }
        return 0;
    }

    @Override
    public String getMoney() {
        return "Lots of money";
    }
    
}
