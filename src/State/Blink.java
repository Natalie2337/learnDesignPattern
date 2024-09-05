package State;

public class Blink implements State{
    @Override
    public void handle() {
        System.out.println("Blink");
    }
}
