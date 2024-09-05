package Flyweight;

// 其实不用这样，DrawCircle 和 DrawSquare 和 DrawTriangle可以统一成一个DrawShape
@Deprecated
public class DrawCircle implements Flyweight{

    private int x;
    private int y;

    @Override
    public void drawShape() {
        System.out.println("CIRCLE drawn at ("+x+","+y+")");
    }

    @Override
    public void setCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
