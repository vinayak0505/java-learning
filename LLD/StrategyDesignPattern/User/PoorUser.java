package LLD.StrategyDesignPattern.User;

import LLD.StrategyDesignPattern.Vehical.Vehical;

public class PoorUser extends User {
    final Vehical vehical;
    public PoorUser(Vehical vehical) {
        super(vehical);
        this.vehical = vehical;
    }
    @Override
    public String getMoney() {
        return "less Moeny";
    }

}
