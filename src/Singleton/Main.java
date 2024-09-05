package Singleton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Trader Joe's! ");
        Scanner scanner = new Scanner(System.in);
        ShoppingCart myShoppingCart = ShoppingCart.getMyCart();

        int cnt=0;
        while(true){
            String name = scanner.next();
            if(name.equals("end")){
                break;
            }
            if(cnt>100){
                break;
            }

            int count = scanner.nextInt();
            scanner.nextLine();
            cnt++;
            myShoppingCart.reviseCart(name, count);
        }

        scanner.close();
        myShoppingCart.checkOut();
    }
}
