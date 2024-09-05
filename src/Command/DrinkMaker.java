package Command;

//接收者(receiver)类-制作饮品
public class DrinkMaker {
    public void makeDrink(String drinkName) {
        System.out.println(drinkName+" is ready!");
    }

    public void stopMakeDrink(String drinkName){
        System.out.println("Don't make "+drinkName);
    }
}
