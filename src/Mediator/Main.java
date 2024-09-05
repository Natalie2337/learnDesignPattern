package Mediator;

// 通过⼀个中介对象来封装⼀组对象之间的交互，从⽽使这些对象不需要直接相互引⽤。
// 就想象成一个金融第三方中介，大家都通过它来联系

//抽象中介者（Mediator）： 定义中介者的接⼝，⽤于各个具体同事对象之间的通信。
//具体中介者（Concrete Mediator）： 实现抽象中介者接⼝，负责协调各个具体同事对象的交互关系，它需要知道所有具体同事类，并从具体同事接收消息，向具体同事对象发出命令。
//抽象同事类（Colleague）： 定义同事类的接⼝，维护⼀个对中介者对象的引⽤，⽤于通信。
//具体同事类（Concrete Colleague）： 实现抽象同事类接⼝，每个具体同事类只知道⾃⼰的⾏为，⽽不了解其他同事类的情况，因为它们都需要与中介者通信，通过中介者协调与其他同事对象的交互。


// 小明正在设计一个简单的多人聊天室系统，有多个用户和一个聊天室中介者，用户通过中介者进行聊天，请你帮他完成这个系统的设计。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < num; i++) {
            String name = scanner.next();
            User user = new User(name,chatRoom);
            user.register();
        }

        int cnt = 0;
        while (true) {
            System.out.println("Choose to message public(1) or message individual(2) or break: ");
            int choice = scanner.nextInt();
            if((choice!=1) && (choice!=2)){
                break;
            }
            if(cnt>100){
                break;
            }
            scanner.nextLine();
            System.out.println("Sender and one-word-message?");
            String sender = scanner.next();
            String one_word_message = scanner.next();
            switch(choice){
                case 1:
                    chatRoom.sendPublicMessage(chatRoom.getUser(sender),one_word_message);
                    break;
                case 2:
                    System.out.println("To whom?");
                    String receiver = scanner.next();
                    chatRoom.sendPrivateMessage(chatRoom.getUser(sender),chatRoom.getUser(receiver),one_word_message);
                    break;
                default:
                    break;
            }
            cnt++;
        }
        scanner.close();
    }
}
