package LLD.StrategyDesignPattern.User;

import LLD.StrategyDesignPattern.Vehical.Vehical;

public abstract class User {
    // variable injection
    static public String tag = "User";
    public Vehical vehical;

    // contructor injection
    public User(Vehical vehical) {
        this.vehical = vehical;
    }

    // function injechtion
    public void updateVehical(Vehical vehical) {
        this.vehical = vehical;
    }

    final public int getTime(int distance) {
        return distance / vehical.getSpeed();
    }

    public abstract String getMoney();
    
}
