package ChainofResponsibility;

// 责任链模式:允许构建⼀个对象链，让请求从链的⼀端进⼊，然后沿着链上的对象依次处理，直到链上的某个对象能够处理该请求为⽌。

// 职责链上的处理者就是⼀个对象，可以对请求进⾏处理或者将请求转发给下⼀个节点，这个场景在⽣活中很常⻅，
// 就是⼀个逐层向上递交的过程，最终的请求要么被处理者所处理，要么处理不了。

// 责任链模式包括以下⼏个基本结构：
//处理者 Handler ：定义⼀个处理请求的接⼝，包含⼀个处理请求的抽象⽅法和⼀个指向下⼀个处理者的链接。
//具体处理者 ConcreteHandler : 实现处理请求的⽅法，并判断能否处理请求，如果能够处理请求则进⾏处理，否则将请求传递给下⼀个处理者。
//客户端：创建并组装处理者对象链，并将请求发送到链上的第⼀个处理者。

// 就类似于层层审批

import java.util.Scanner;

/*
小明所在的公司请假需要在OA系统上发布申请，整个请求流程包括多个处理者，每个处理者负责处理不同范围的请假天数，如果一个处理者不能处理请求，就会将请求传递给下一个处理者，
请你实现责任链模式，可以根据请求天数找到对应的处理者。
审批责任链由主管(Supervisor), 经理(Manager)和董事（Director)组成，他们分别能够处理3天、7天和10天的请假天数。如果超过10天，则进行否决。
*/
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setNext();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < num; i++) {
            String name = scanner.next();
            int hours = scanner.nextInt();
            scanner.nextLine();
            Leaders start = context.getChainStart();
            start.handleRequest(hours);
        }
        scanner.close();
    }
}
