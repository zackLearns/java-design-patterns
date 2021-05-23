package observer.observables;

import java.util.ArrayList;
import java.util.List;

public class Observable<T> {

    private List<Observer<T>> observers = new ArrayList<>();

    public void subscribe(Observer<T> observer) {
        observers.add(observer);
    }

    protected void propertyChanged(T source, String propertyName, Object newValue) {
        for(Observer<T> observer : observers) {
            observer.handle(new PropertyChangedEventArgs<T>(
                    source, propertyName, newValue
            ));
        }
    }
}
