package Strategy;

// 策略模式是⼀种⾏为型设计模式，它定义了⼀系列算法（这些算法完成的是相同的⼯作，只是实现不同），并将每个算法封装起来，使它们可以相互替换
// 算法的变化不会影响使⽤算法的客户。
// 将不同的优惠算法封装成独⽴的类避免了⼤量的条件语句，
// 如果新增优惠算法，可以添加新的策略类来实现，客户端在运⾏时选择不同的具体策略，⽽不必修改客户端代码改变优惠策略


//策略模式包含下⾯⼏个结构：
//策略类 Strategy : 定义所有⽀持的算法的公共接⼝。
//具体策略类 ConcreteStrategy : 实现了策略接⼝，提供具体的算法实现。
//上下⽂类 Context : 包含⼀个策略实例，并在需要时调⽤策略对象的⽅法。

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> discountPrice = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=0; i<num; i++){
            int price = scanner.nextInt();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    Context context1 = new Context(new DiscountA());
                    int ans1 = context1.contextInterface(price);
                    discountPrice.add(ans1);
                    break;
                case 2:
                    Context context2 = new Context(new DiscountB());
                    int ans2 = context2.contextInterface(price);
                    discountPrice.add(ans2);
                    break;
            }
        }

        for(var item: discountPrice){
            System.out.println(item);
        }
    }
}
