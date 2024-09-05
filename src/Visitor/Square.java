package Visitor;

public class Square implements Element{
    private double length;
    private double width;

    public Square(double l, double w){
        length = l;
        width = w;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
