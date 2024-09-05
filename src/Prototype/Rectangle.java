package Prototype;

public class Rectangle extends Prototype{
    private String color;
    private int length;
    private int width;

    public Rectangle(String color, int length, int width){
        this.color = color;
        this.length = length;
        this.width = width;
        draw(color,length,width);
    }

    public void draw(String color, int length, int width){
        System.out.println("Color: "+color+", Width: "+length+", width: "+width);
    }

    @Override
    public Prototype clone() {
        return new Rectangle(color, length, width);
    }
    // 有点没懂，这里的clone不也是new一个吗，有什么区别吗？
    // 感觉能省点事情，直接复制？？
}
