package FactoryMethod;

// 抽象产品
public class Square implements Blocks{
    @Override
    public void draw(){
        System.out.println("Square Block");
    }
}
