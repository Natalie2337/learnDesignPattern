package Observer;

//小明所在的学校有一个时钟（主题），每到整点时，它就会通知所有的学生（观察者）当前的时间，请你使用观察者模式实现这个时钟通知系统。
//注意点：时间从 0 开始，并每隔一个小时更新一次。

// 观察者模式依赖主题和观察者，⼀般有4个组成部分
//主题Subject：⼀般会定义成⼀个接⼝，提供⽅法⽤于注册、删除和通知观察者，通常也包含⼀个状态，当状态发⽣改变时，通知所有的观察者。
//观察者Observer: 观察者也需要实现⼀个接⼝，包含⼀个更新⽅法，在接收主题通知时执⾏对应的操作。
//具体主题ConcreteSubject: 主题的具体实现, 维护⼀个观察者列表，包含了观察者的注册、删除和通知⽅法。
//具体观察者ConcreteObserver : 观察者接⼝的具体实现，每个具体观察者都注册到具体主题中，当主题状态变化并通知到具体观察者，具体观察者进⾏处理。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentNumber = scanner.nextInt();
        scanner.nextLine();

        Clock clock = new Clock();

        for (int i = 0; i < studentNumber; i++) {
            String name = scanner.next();
            Student student = new Student(name);
            student.registerClock();
            clock.registerStudent(student);
        }

        int updateTimes = scanner.nextInt();

        for (int i = 0; i < updateTimes; i++) {
            clock.setCurrentTime(i);
            clock.Notify();
        }
        scanner.close();
    }
}
