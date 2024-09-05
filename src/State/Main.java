package State;

// State （状态）： 定义⼀个接⼝，⽤于封装与Context的⼀个特定状态相关的⾏为。
// ConcreteState （具体状态）： 负责处理Context在状态改变时的⾏为, 每⼀个具体状态⼦类实现⼀个与 Context 的⼀个状态相关的⾏为。
// Context （上下⽂）: 维护⼀个具体状态⼦类的实例，这个实例定义当前的状态。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < num; i++) {
            String order = scanner.next();
            State state = context.recognizeState(order);
            context.switchState(state);
        }
        scanner.close();
    }
}
