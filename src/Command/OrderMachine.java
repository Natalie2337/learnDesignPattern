package Command;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

// 调⽤者(Invoker)类-点餐机
// 调⽤者类中可以维护⼀个命令队列或者“撤销栈”，以⽀持批处理和撤销命令。
// ！！！！
public class OrderMachine {
    private Queue<Command> commandQueue; //命令队列
    private Stack<Command> undoStack; //撤销栈

    public OrderMachine(){
        commandQueue = new LinkedList<>();
        undoStack = new Stack<>();
    }

    public void addCommand(Command command){
        boolean a  = commandQueue.offer(command); // queue.offer()类似queue.add()，但是不同于add(),它不会在超过容量时抛出异常,而是返回一个bool值
        undoStack.push(command);
    }

    public void executeCommandsInQueue(){
        for(var command: commandQueue){
            command.execute();
        }
    }

    public void undoLastCommand(){
        if(!undoStack.isEmpty()){
            Command lastCommand = undoStack.pop();
            lastCommand.undo();
        }else{
            System.out.println("No Command to Undo");
        }
    }

}
