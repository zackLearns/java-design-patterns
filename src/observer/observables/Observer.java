package observer.observables;

public interface Observer<T> {

    void handle(PropertyChangedEventArgs<T> args);
}
