package FactoryMethod;

import java.util.Scanner;
//import FactoryMethod.Circle;

public class Main {
    public static void main(String[] args) {
        SquareFactory squareFactory = new SquareFactory();
        CircleFactory circleFactory = new CircleFactory();

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<num; i++){
            String type = scanner.next();
            int count = scanner.nextInt();
            scanner.nextLine(); // 读取换行符以准备下一次读取！
            System.out.println(type);
            System.out.println(count);

            if(type.equals("Square")){
                for(int j=0; j<count; j++){
                    Blocks s = squareFactory.CreateBlocks();
                    s.draw();
                }
            } else if(type.equals("Circle")){
                for(int j=0; j<count; j++){
                    Blocks c = circleFactory.CreateBlocks();
                    c.draw();
                }
            } else{
                System.out.println("Invalid Input of Shape!");
            }
        }
        scanner.close();
    }
}
