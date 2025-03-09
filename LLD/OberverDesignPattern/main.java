package LLD.OberverDesignPattern;

import LLD.OberverDesignPattern.Implementation.ObservableImpl;
import LLD.OberverDesignPattern.Implementation.ObserverImpl;
import LLD.OberverDesignPattern.Interface.Observable;
import LLD.OberverDesignPattern.Interface.Observer;

public class Main {
    public static void main(String[] args) {
        Observable<Integer> observable = new ObservableImpl<Integer>();
        Observer observer = new ObserverImpl<Integer>(observable);
        observable.add(observer);
        observable.setData(10);
    }
}
