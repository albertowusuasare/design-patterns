package observer;

@FunctionalInterface
public interface Observer<T> {
    void notifyChange(T data);
}
