package Strategy;

public class DiscountA implements Strategy{
    @Override
    public int Algorithm(int price) {
        return (int)(price*0.9);
    }
}
