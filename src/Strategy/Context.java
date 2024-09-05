package Strategy;

// 再封装一层
public class Context {
    private Strategy strategy; // 接口这么用是可以的

    public Context(Strategy s){
        strategy = s;
    }

    public int contextInterface(int price){
        return strategy.Algorithm(price);
    }

}
