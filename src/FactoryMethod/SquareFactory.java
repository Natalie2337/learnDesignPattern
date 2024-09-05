package FactoryMethod;

public class SquareFactory implements BlocksFactory{
    @Override
    public Blocks CreateBlocks() {
        return new Square();
    }
}
