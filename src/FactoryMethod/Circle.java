package FactoryMethod;

//具体产品
public class Circle implements Blocks{
    @Override
    public void draw() {
        System.out.println("Circle Block");
    }
}
