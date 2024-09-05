package Strategy;

public class DiscountB implements Strategy {
    @Override
    public int Algorithm(int price) {
        int ans = price;
        if(price>=300){
            ans -= 40;
        }else if(price>=200){
            ans -= 25;
        }else if(price>=150){
            ans -= 15;
        }else if(price>=100){
            ans -= 5;
        }
        return ans;
    }
}
