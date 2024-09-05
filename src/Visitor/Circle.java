package Visitor;

public class Circle implements Element{

    private double radius;

    public Circle(double rad){
        radius = rad;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
