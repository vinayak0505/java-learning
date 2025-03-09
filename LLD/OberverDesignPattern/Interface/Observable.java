package LLD.OberverDesignPattern.Interface;

public interface Observable<T> {
    public void add(Observer o);
    public void remove(Observer o);
    public void notifyObserver();
    public void setData(T data);
    public T getData();
}
