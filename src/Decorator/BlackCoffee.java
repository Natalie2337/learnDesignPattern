package Decorator;

public class BlackCoffee implements Coffee{

    @Override
    public void makeCoffee() {
        System.out.println("Brewing Black Coffee");
    }
}
