package Memento;

// 创建发起人：可以创建备忘录对象
public class Originator {

    private Caretaker caretaker;

    private Operation currOperation;

    private int currNumber;

    public Originator(Caretaker caretaker){
        // 初始化Originator
        currOperation = Operation.INITIAL;
        currNumber = 0;
        this.caretaker = caretaker;
    }

    public void setCurrOperation(Operation operation){
        currOperation = operation;
    }

    public Memento CreateMemento(){
        return new Memento(currOperation, currNumber);
    }

    public void showCurrNumber(){
        System.out.println("Current Number: "+currNumber);
    }

    public void Increase(){
        currNumber = currNumber +1;
        Memento m = new Memento(Operation.INCREMENT,currNumber);
        caretaker.insert(m);
    }

    public void Decrease(){
        currNumber = currNumber -1;
        Memento m = new Memento(Operation.DECREMENT,currNumber);
        caretaker.insert(m);
    }

    public void Undo(){
        caretaker.unDoLastMemento();
        Memento nowMemento = caretaker.getLastMemento();
        currOperation = nowMemento.getCurrentOperation();
        currNumber = nowMemento.getCurrentNumber();
    }

    public void Redo(){
        Memento nowMemento = caretaker.getLastRedoMemento();
        currOperation = nowMemento.getCurrentOperation();
        currNumber = nowMemento.getCurrentNumber();
        caretaker.insert(nowMemento);
    }

    public void execute(){
        switch(currOperation){
            case INITIAL -> {}
            case INCREMENT -> Increase();
            case DECREMENT -> Decrease();
            case UNDO -> Undo();
            case REDO -> Redo();
        }
        showCurrNumber();
    }

    public Operation operationOfInputString(String input){
        String str = input.toUpperCase();
        if (str.equals("INCREMENT")) {
            return Operation.INCREMENT;
        } else if(str.equals("DECREMENT")){
            return Operation.DECREMENT;
        } else if(str.equals("REDO")){
            return Operation.REDO;
        } else if(str.equals("UNDO")){
            return Operation.UNDO;
        }
        throw new RuntimeException(); //??
    }

}
