package Visitor;

public class AreaCalculator implements Visitor{

    // Override方法参数要类型和interface中的完全一样，而不可以是它(比如Element)的子类各来两遍
    @Override
    public void visit(Square square) {
        double length = square.getLength();
        double width = square.getWidth();
        double area = length * width;
        System.out.println(area);
    }

    @Override
    public void visit(Circle circle) {
        double radius = circle.getRadius();
        double area = 3.14 * radius * radius;
        System.out.println(area);
    }
    // 具体对每种元素怎么操作应该是在visitor中定义的，就好比兽医诊断，对不同动物对操作应该是兽医决定的

}
