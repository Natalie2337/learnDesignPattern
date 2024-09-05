package ChainofResponsibility;

public interface Handler {
    void handleRequest(int time);
    void setNextHandler(Handler nextHandler);
    Handler getNextHandler();
}
