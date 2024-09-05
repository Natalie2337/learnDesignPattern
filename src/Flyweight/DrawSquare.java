package Flyweight;
@Deprecated
public class DrawSquare implements Flyweight{

    private int x;
    private int y;

    @Override
    public void drawShape() {
        System.out.println("SQUARE drawn at ("+x+","+y+")");
    }

    @Override
    public void setCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
