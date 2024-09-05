package Proxy;

public class Buyer implements Subject{
    @Override
    public void buyHouse() {
        System.out.println("Yes, I want to see the house");
    }
}
