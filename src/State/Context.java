package State;

import java.util.NoSuchElementException;

public class Context {
    private State currentState;

    public Context(){
        currentState = new Off();
    }

    public void setCurrentState(State state){
        currentState = state;
    }

    public void performOperation(){
        currentState.handle();
    }

    public void switchState(State state){
        this.setCurrentState(state);
        this.performOperation();
    }

    public State recognizeState(String input){
        if(input.equals("On")){
            return new On();
        }else if(input.equals("Off")){
            return new Off();
        }else if(input.equals("Blink")){
            return new Blink();
        }
        throw new NoSuchElementException();
    }

}
