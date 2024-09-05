package Mediator;

public interface Mediator {
    void register(User user);
    void remove(User user);
    void sendPublicMessage(User user, String message); //谁，发了什么消息。支持对公共发消息
    void sendPrivateMessage(User sender, User receiver, String message); //一对一发消息
}
