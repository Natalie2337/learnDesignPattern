package Flyweight;

import java.util.HashMap;
import java.util.Map;

// 享元⼯⼚类，创建并管理 Flyweight 对象，当⽤户请求⼀个 Flyweight 时，享元⼯⼚会提供⼀个已经创建的实例或者创建⼀个。
public class FlyweightFactory {
    // 使用map来管理Flyweight对象
    private Map<String, DrawShape> flyweights = new HashMap<>();
    // key是不同形状的名字

    public Flyweight getFlyweightObject(String shapeName, int x, int y){
        if(!flyweights.containsKey(shapeName.toUpperCase())){
            // 之前不存在
            DrawShape drawShape = new DrawShape(shapeName.toUpperCase());
            drawShape.setCoordinate(x,y);
            drawShape.drawShape();
            flyweights.put(shapeName, drawShape);
            return drawShape;
        } else{
            DrawShape drawShape = flyweights.get(shapeName.toUpperCase());
            drawShape.setCoordinate(x,y);
            drawShape.drawShape();
            return drawShape;
        }
    }
}
