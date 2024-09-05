package Adapter;

// 适配器设计模式：将⼀个类的接⼝转换成客户希望的另⼀个接⼝，
// 主要⽬的是充当两个不同接⼝之间的桥梁，使得原本接⼝不兼容的类能够⼀起⼯作。
// 就想象是苹果的type-C和u盘的type-A转换口，或者220v-110v的转换器
//当使⽤⼀个已经存在的类，但是它的接⼝与你的代码不兼容时，可以使⽤适配器模式。
//在系统扩展阶段需要增加新的类时，并且类的接⼝和系统现有的类不⼀致时，可以使⽤适配器模式。

// 适配器模式分为以下⼏个基本⻆⾊：
// ⽬标接⼝ Target : 客户端希望使⽤的接⼝
// 适配器类 Adapter : 实现客户端使⽤的⽬标接⼝，持有⼀个需要适配的类实例。
// 被适配者 Adaptee : 需要被适配的类

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Macbook myMac = new Macbook();
        Adapter adapter = new Adapter(new Adaptee());
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<num; i++){
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    myMac.CType();
                    break;
                case 2:
                    adapter.type();
                    // 实际上adapter并没有和myMac“联系”起来，而是一个单独的可以转化成USB的新类，myMac不支持USB
                    break;
                default:
                    System.err.println("Wrong Input Number");
                    break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
