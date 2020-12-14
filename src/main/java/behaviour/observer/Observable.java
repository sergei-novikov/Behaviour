package behaviour.observer;
/**
 * Интерфейс оповещателя
 *
 */
 public interface Observable {
     void addObserver(Observer o);
     void deleteObserver(Observer o);
     void notifyObservers();
}
