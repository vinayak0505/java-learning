package LLD.OberverDesignPattern.Implementation;

import LLD.OberverDesignPattern.Interface.Observable;
import LLD.OberverDesignPattern.Interface.Observer;

public class ObserverImpl<T> implements Observer {
    Observable<T> observable;

    public ObserverImpl(Observable<T> observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        Object data = observable.getData();
        System.out.println("ObserverImpl: " + data);
    }
    
}
