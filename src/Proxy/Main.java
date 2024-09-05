package Proxy;

// 代理模式: ⽤于控制对其他对象的访问。
// 允许⼀个对象（代理）充当另⼀个对象（真实对象）的接⼝，以控制对这个对象的访问。可以在访问对象时添加额外的控制逻辑，⽐如限制访问权限
// 代理模式的主要⻆⾊有：
// Subject（抽象主题）： 抽象类，通过接⼝或抽象类声明真实主题和代理对象实现的业务⽅法。
// RealSubject（真实主题）：定义了Proxy所代表的真实对象，是客户端最终要访问的对象。
// Proxy（代理）：包含⼀个引⽤，该引⽤可以是RealSubject的实例，控制对RealSubject的访问，并可能负责创建和删除RealSubject的实例。


import java.util.Scanner;

//小明想要购买一套房子，他决定寻求一家房产中介来帮助他找到一个面积超过100平方米的房子，只有符合条件的房子才会被传递给小明查看。
public class Main {
    public static void main(String[] args) {
        Agency agency = new Agency();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < num; i++) {
            int area = scanner.nextInt();
            scanner.nextLine();
            agency.buyHouse(area);
        }
        scanner.close();
    }
}
