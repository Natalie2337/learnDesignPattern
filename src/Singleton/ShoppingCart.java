package Singleton;

// https://kamacoder.com/
// 单例模式
// 小明去了一家大型商场，拿到了一个购物车，并开始购物。
// 请你设计一个购物车管理器，记录商品添加到购物车的信息（商品名称和购买数量），并在购买结束后打印出商品清单。（在整个购物过程中，小明只有一个购物车实例存在）。

// 饿汉式: 实例在类加载时就被创建，不需要考虑多线程的互斥机制
// 懒汉式：实例在第一次使用时才创建，可以避免实例没被使用的资源浪费

//想要实现⼀个单例设计模式，必须遵循以下规则：
//私有的构造函数：防⽌外部代码直接创建类的实例
//私有的静态实例变量：保存该类的唯⼀实例
//公有的静态⽅法：通过公有的静态⽅法来获取类的实例


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {

    //private List<Integer> counts;
    //private List<String> names;
    // 嘶要用map，因为同一种商品买两次的话应该加在一起
    private Map<String, Integer> myMap;

    private ShoppingCart(){
        //counts = new ArrayList<>();
        //names = new ArrayList<>();
        myMap = new HashMap<>();
    }

    private static ShoppingCart myCart = new ShoppingCart(); //为什么需要final呢？

    public static ShoppingCart getMyCart(){
        return myCart;
    }

    public void reviseCart(String name, int count){
        // 不能用static呀，因为这要是实例myCart能拿到呀

        if(myMap.containsKey(name)){
            int temp = myMap.get(name);
            temp += count;
            myMap.put(name,temp);
        } else{
            myMap.put(name,count);
        }
    }

    public void checkOut(){
        for(var entry:myMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        myMap.clear();  // 要加上！
    }
}
