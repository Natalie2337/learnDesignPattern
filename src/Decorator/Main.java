package Decorator;

//https://kamacoder.com/problempage.php?pid=1086

//小明喜欢品尝不同口味的咖啡，他发现每种咖啡都可以加入不同的调料，比如牛奶、糖和巧克力。他决定使用装饰者模式制作自己喜欢的咖啡。
//请设计一个简单的咖啡制作系统，使用装饰者模式为咖啡添加不同的调料。系统支持两种咖啡类型：黑咖啡（Black Coffee）和拿铁（Latte）。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Coffee and Dressing, input 0 to end");
        int cnt = 0;
        while(true){
            if(cnt>100){
                break;
            }
            int a = scanner.nextInt();
            if(a==0){
                break;
            }else if(a==1){
                Latte latte = new Latte();
                latte.makeCoffee();
            }else if(a==2){
                BlackCoffee blackCoffee = new BlackCoffee();
                blackCoffee.makeCoffee();
            }else{
                System.out.println("Wrong Input Number!");
            }
            int b = scanner.nextInt();
            if(b==1){
                AddMilk addMilk = new AddMilk();
                addMilk.AddDressing();
            }else if(b==2){
                AddSugar addSugar = new AddSugar();
                addSugar.AddDressing();
            }else{
                System.out.println("Wrong Input Number!");
            }
            cnt++;
        }

        scanner.close();
    }
}
