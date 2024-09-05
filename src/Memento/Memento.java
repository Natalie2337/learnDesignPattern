package Memento;

// 备忘录类：保存发起⼈对象的状态
// 注意一个“备忘录对象”对应一个状态
public class Memento {

    private Operation operation;
    private int currentNumber; // 因为我最后要看数，而不只是操作，所以数必须与Memento关联

    public Memento(Operation operation,int currentNumber){
        this.operation = operation;
        this.currentNumber = currentNumber;
    }

    public Operation getCurrentOperation(){
        return this.operation;
    }

    public int getCurrentNumber(){
        return this.currentNumber;
    }

}
