package Command;

// 命令模式：
// 将请求封装成⼀个对象(命令对象，包含执⾏操作所需的所有信息)，并将命令对象按照⼀定的顺序存储在队列中
// 然后再逐⼀调⽤执⾏，这些命令也可以⽀持反向操作，进⾏撤销和重做。
// 发送者只需要触发命令就可以完成操作，不需要知道接受者的具体操作，从⽽实现两者间的解耦。

// 遥控器？？

//命令模式包含以下⼏个基本⻆⾊：
//命令接⼝ Command ：接⼝或者抽象类，定义执⾏操作的接⼝。
//具体命令类 ConcreteCommand : 实现命令接⼝，执⾏具体操作，在调⽤ execute ⽅法时使“接收者对象”根据命令完成具体的任务，⽐如遥控器中的“开机”，“关机”命令。
//接收者类 Receiver : 接受并执⾏命令的对象，可以是任何对象，遥控器可以控制空调，也可以控制电视机，电视机和空调负责执⾏具体操作，是接收者。
//调⽤者类 Invoker : 发起请求的对象，有⼀个将命令作为参数传递的⽅法。它不关⼼命令的具体实现，只负责调⽤命令对象的 execute() ⽅法来传递请求，在本例中，控制遥控器的“⼈”就是调⽤者。
//客户端：创建具体的命令对象和接收者对象，然后将它们组装起来。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderMachine orderMachine = new OrderMachine();
        DrinkMaker drinkMaker = new DrinkMaker();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < num; i++) {
            String drinkName = scanner.next();
            orderMachine.addCommand(new OrderCommand(drinkName,drinkMaker));
        }
        orderMachine.executeCommandsInQueue();
        scanner.close();
    }
}
