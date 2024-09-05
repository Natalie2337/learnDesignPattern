package Decorator;

public class AddSugar implements CoffeeDressing{
    @Override
    public void AddDressing() {
        System.out.println("Add Sugar");
    }
}
