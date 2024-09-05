package Decorator;

public class Latte implements Coffee {
    @Override
    public void makeCoffee() {
        System.out.println("Brewing Latte");
    }
}
