package behaviour.state;

/**
 * Состояние, реализующее поведение закрытой заявки.
 */
 public class CloseRequestState implements State {
    private Request request;

    public CloseRequestState(Request r) {
        this.request = r;
    }

    @Override
    public void createRequest() {}

    @Override
    public void handleRequest() {}

    @Override
    public void closeRequest() {}
}
