package Memento;

// 备忘录模式：备份状态
// 在不暴露对象实现的情况下捕获对象的内部状态，并在对象之外保存这个状态，以便稍后可以将其还原到先前的状态。

// 备忘录模式包括以下⼏个重要⻆⾊：
// 发起⼈ Originator : 需要还原状态的那个对象，负责创建⼀个备忘录，并使⽤备忘录记录当前时刻的内部状态。
// 备忘录 Memento : 存储发起⼈对象的内部状态，它可以包含发起⼈的部分或全部状态信息，但是对外部是不可⻅的，只有发起⼈能够访问备忘录对象的状态。
// 注：备忘录有两个接⼝，发起⼈能够通过宽接⼝访问数据，管理者只能看到窄接⼝，并将备忘录传递给其他对象。
// 管理者 Caretaker : 负责存储备忘录对象，但并不了解其内部结构，管理者可以存储多个备忘录对象。
// 客户端：在需要恢复状态时，客户端可以从管理者那⾥获取备忘录对象，并将其传递给发起⼈进⾏状态的恢复

// 小明正在设计一个简单的计数器应用，支持增加（Increment）和减少（Decrement）操作，以及撤销（Undo）和重做（Redo）操作，请你使用备忘录模式帮他实现。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator(caretaker);

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < num; i++) {
            String input = scanner.next();
            Operation operation  = originator.operationOfInputString(input);
            originator.setCurrOperation(operation);
            originator.execute();
        }
        scanner.close();
    }
}
