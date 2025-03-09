package LLD.StrategyDesignPattern;

import LLD.StrategyDesignPattern.User.PoorUser;
import LLD.StrategyDesignPattern.User.RichUser;
import LLD.StrategyDesignPattern.User.User;
import LLD.StrategyDesignPattern.Vehical.Car;
import LLD.StrategyDesignPattern.Vehical.EngineVecal;

public class Main {
    public static void main(String[] args) {
        EngineVecal car = new Car();
        User user = new PoorUser(car);
        User user2 = new RichUser(car);

        System.out.println(user.getTime(10));
        System.out.println(user2.getMoney());
    };
}
