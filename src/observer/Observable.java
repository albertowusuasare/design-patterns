package observer;


public interface Observable<T> {
    void registerObserver(Observer<T> observer );
    void deRegisterObserver(Observer<T> observer);
    void notifyObservers();
}
