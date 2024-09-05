package Memento;

@Deprecated
public class State {

    private int number;

    public State(int number){
        this.number = number;
    }

    public State(){
        this.number = 0;
    }


    public int getNumber(){
        return number;
    }

    public void setNumber(int num){
        number = num;
    }


    public int Increment(){
        // add 1
        number = number+1;
        return number;
    }

    public int Decrement(){
        // minus 1
        number = number-1;
        return number;
    }

}
