package State;

public class On implements State{
    @Override
    public void handle() {
        System.out.println("On");
    }
}
