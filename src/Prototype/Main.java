package Prototype;

// 原型模式
// 基于现有的对象创建新的对象，⽽不是从头开始创建。
//如果⼀个对象的创建过程⽐较复杂时（⽐如需要经过⼀系列的计算和资源消耗），那每次创建该对象都需要消耗资源，
//⽽通过原型模式就可以复制现有的⼀个对象来迅速创建/克隆⼀个新对象，不必关⼼具体的创建细节，可以降低对象创建的成本。

// 原型模式包含两个重点模块：
//抽象原型接⼝ prototype : 声明⼀个克隆⾃身的⽅法 clone
//具体原型类 ConcretePrototype : 实现 clone ⽅法，复制当前对象并返回⼀个新对象。
//在客户端代码中，可以声明⼀个具体原型类的对象，然后调⽤ clone() ⽅法复制原对象⽣成⼀个新的对象。

//实现原型模式需要给【原型对象】声明⼀个克隆⽅法，执⾏该⽅法会创建⼀个当前类的新对象，并将原始对象中的
//成员变量复制到新⽣成的对象中，⽽不必实例化。并且在这个过程中只需要调⽤原型对象的克隆⽅法，⽽⽆需知道
//原型对象的具体类型。

import java.util.Scanner;

//公司正在开发一个图形设计软件，其中有一个常用的图形元素是矩形。设计师在工作时可能需要频繁地创建相似的矩形，而这些矩形的基本属性是相同的（颜色、宽度、高度），
//为了提高设计师的工作效率，请你使用原型模式设计一个矩形对象的原型。使用该原型可以快速克隆生成新的矩形对象。
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String color = scanner.next();
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        scanner.nextLine();
        int num = scanner.nextInt();

        // 创建原型对象
        Prototype origin = new Rectangle(color, length, width);

        // 复制几遍
        for(int i=0; i<num; i++){
            Prototype cloneObj = origin.clone();
        }
    }
}

//但是使⽤原型模式也需要考虑到如果对象的内部状态包含了引⽤类型的成员变量，那么实现深拷⻉就会变得较为复杂，需要考虑引⽤类型对象的克隆问题。