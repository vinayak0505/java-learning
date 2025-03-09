package LLD.OberverDesignPattern.Implementation;

import java.util.ArrayList;
import java.util.List;

import LLD.OberverDesignPattern.Interface.Observable;
import LLD.OberverDesignPattern.Interface.Observer;

public class ObservableImpl<T> implements Observable<T>{
    List<Observer> observer;
    T data;

    public ObservableImpl() {
        observer = new ArrayList<>();
    }

    @Override
    public void add(Observer o) {
        observer.add(o);
    }

    @Override
    public void remove(Observer o) {
        observer.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observer) {
            o.update();
        }
    }

    @Override
    public void setData(T data) {
        this.data = data;
        notifyObserver();
    }

    @Override
    public T getData() {
        return this.data;
    }
    
    
}
