package Visitor;

// Shape就是元素
public interface Element {
    void accept(Visitor visitor);
}
