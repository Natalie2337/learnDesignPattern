package Memento;

import java.util.Stack;

// 创建管理者：维护⼀组备忘录对象
public class Caretaker {

    private Stack<Memento> ToDomementos = new Stack<>();

    private Stack<Memento> ReDoMementos = new Stack<>();

    public void insert(Memento memento){
        ToDomementos.push(memento);
        //System.out.println("stack size: " + ToDomementos.size());
    }

    public Memento getLastMemento(){
        if(!ToDomementos.isEmpty()){
            return ToDomementos.peek();
        }
        throw new RuntimeException(); //?
    }

    public void unDoLastMemento(){
        if(!ToDomementos.isEmpty()){
            Memento m = ToDomementos.pop(); // Removes the object at the top of this stack and returns that object as the value of this function.
            ReDoMementos.push(m);
            return;
        }
        throw new RuntimeException();
    }

    public Memento getLastRedoMemento(){
        if(!ReDoMementos.isEmpty()){
            return ReDoMementos.pop();
        }
        throw new RuntimeException();
    }

    // ??
//    public Memento getMementoFromIndex(int i) throws IndexOutOfBoundsException {
//        if(i< mementos.size()){
//            return mementos.get(i);
//        }
//        throw new IndexOutOfBoundsException();
//    }

}
