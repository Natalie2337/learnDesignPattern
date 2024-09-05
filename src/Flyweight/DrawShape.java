package Flyweight;

public class DrawShape implements Flyweight{

    private int x;
    private int y;
    private String shapeName;

    public DrawShape(String shapeName){
        this.shapeName = shapeName;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    @Override
    public void drawShape() {
        System.out.println(shapeName+" drawn at ("+x+","+y+")");
    }

    @Override
    public void setCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
