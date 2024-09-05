package Decorator;

public class AddMilk implements CoffeeDressing{
    @Override
    public void AddDressing() {
        System.out.println("Add Milk");
    }
}
