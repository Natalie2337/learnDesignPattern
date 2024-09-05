package FactoryMethod;

public class CircleFactory implements BlocksFactory{
    @Override
    public Blocks CreateBlocks(){
        return new Circle();
    }
}
