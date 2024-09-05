package Visitor;

public interface Visitor {
    void visit(Square square);
    void visit(Circle circle);
    // 但是要是每种元素都定义一个visit()，那岂不是要写很多很多？
}
