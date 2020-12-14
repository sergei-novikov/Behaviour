package behaviour.observer;
/**
 * Интерфейс для подсчиков
 */
 public interface Observer {
    void update(Observable o);
    void sendNews();
}
