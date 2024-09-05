package Visitor;

import java.util.ArrayList;
import java.util.List;

// 让对象访问每个具体元素的实例，因为一种元素可能有很多个实例
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();
    public void attach(Element element){
        elements.add(element);
    }

    public void detach(Element element){
        elements.remove(element);
    }

    public void ErgodicCalculateArea(Visitor visitor){
        for(var e:elements){
            e.accept(visitor);
        }
    }

}
