package Mediator;

public interface Colleague {
    void receiveMessage(String message); // 对public和private消息的receive是一样的
    void sendPublicMessage(String message);
    void sendPrivateMessage(String message, User receiver);
    void register();
    void quit();

}
