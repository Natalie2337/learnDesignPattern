package Flyweight;

// 定义享元接⼝，接受外部状态作为参数并进⾏处理。
public interface Flyweight {
    void drawShape();

    void setCoordinate(int x, int y);
}
