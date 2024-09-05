package Proxy;

public class Agency implements Subject{
    private Buyer Ming = new Buyer();

    @Override
    public void buyHouse() {};

    public void buyHouse(int area){
        if(area>100){
            Ming.buyHouse();
        } else{
            System.out.println("No, I would not recommend it to Ming");
        }
    }
}
