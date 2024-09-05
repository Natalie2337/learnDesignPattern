package Prototype;

// 使用abstract class
public abstract class Prototype implements Cloneable{
    // Cloneable是java.lang中的interface
    @Override
    public abstract Prototype clone();
}

//Java 提供了 Object 类的 clone() ⽅法，可以实现对象的浅拷⻉。类需要实现 Cloneable 接⼝并重写 clone() ⽅法