package Flyweight;

// 享元模式！

// 在享元模式中，对象被设计为可共享的，可以被多个上下⽂使⽤，⽽不必在每个上下⽂中都创建新的对象。

// 想要了解享元模式，就必须要区分什么是内部状态，什么是外部状态。
// 内部状态是指那些可以被多个对象共享的状态，它存储在享元对象内部，并且对于所有享元对象都是相同的，这部分状态通常是不变的。
// ⽽外部状态是享元对象依赖的、可能变化的部分。这部分状态不存储在享元对象内部，⽽是在使⽤享元对象时通过参数传递给对象。

// 图书馆中有很多相同的书籍，但每本书都可以被多个⼈借阅，图书馆⾥的书就是内部状态，⼈就是外部状态。
// 再举个开发中的例⼦，假设我们在构建⼀个简单的图形编辑器，⽤户可以在画布上绘制不同类型的图形，⽽图形就是所有图形对象的内部状态（不变的），⽽图形的坐标位置就是图形对象的外部状态（变化的

// 享元接⼝ Flyweight : 所有具体享元类的共享接⼝，通常包含对外部状态的操作。
// 具体享元类 ConcreteFlyweight : 继承 Flyweight 类或实现享元接⼝，包含内部状态。
// 享元⼯⼚类 FlyweightFactory : 创建并管理享元对象，当⽤户请求时，提供已创建的实例或者创建⼀个。
// 客户端 Client : 维护外部状态，在使⽤享元对象时，将外部状态传递给享元对象。

import java.util.Scanner;

// 在一个图形编辑器中，用户可以绘制不同类型的图形，包括圆形（CIRCLE）、矩形（RECTANGLE）、三角形（TRIANGLE）等。现在，请你实现一个图形绘制程序，要求能够共享相同类型的图形对象，以减少内存占用。
public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            String name = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            flyweightFactory.getFlyweightObject(name,x,y);
        }
        scanner.close();
    }
}
