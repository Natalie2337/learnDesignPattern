package Mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ChatRoom implements Mediator{
    List<User> users = new ArrayList<>();

    @Override
    public void register(User user) {
        users.add(user);
    }

    @Override
    public void remove(User user) {
        users.remove(user);
    }

    @Override
    public void sendPrivateMessage(User sender, User receiver, String message) {
        sender.sendPrivateMessage(message,receiver);
        receiver.receiveMessage(message);
    }

    @Override
    public void sendPublicMessage(User user, String message) {
        user.sendPublicMessage(message);
        for(var item:users){
            item.receiveMessage(message);
        }
    }

    public User getUser(int i){
        return users.get(i);
    }

    public User getUser(String name){
        for(var item:users){
            if(item.getName().equals(name)){
                return item;
            }
        }
        throw new NoSuchElementException();
    }
}
