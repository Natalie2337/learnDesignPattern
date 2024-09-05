package Mediator;

public class User implements Colleague{

    private String name;

    public User(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    private Mediator mediator; // interface也可以

    @Override
    public void receiveMessage(String message) {
        System.out.println(name+" received: "+message);
    }

    @Override
    public void sendPublicMessage(String message) {
        System.out.println(name+" "+message);
    }

    @Override
    public void sendPrivateMessage(String message, User receiver) {
        System.out.println("To: "+receiver.getName()+" "+message);
    }

    @Override
    public void quit() {
        mediator.remove(this);
    }

    @Override
    public void register() {
        mediator.register(this);
    }

    public String getName(){
        return name;
    }

}
