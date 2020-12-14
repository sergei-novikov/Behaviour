package behaviour.state;

/**
 * Общий интерфейс состояний
 */
 public interface State {
     void createRequest();
     void handleRequest();
     void closeRequest();

}
