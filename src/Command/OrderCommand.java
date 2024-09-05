package Command;

// 具体命令类-点餐命令
public class OrderCommand implements Command{

    private DrinkMaker receiver;

    private String drinkName;

    public OrderCommand(String n, DrinkMaker r){
        drinkName = n;
        receiver = r;
    }

    @Override
    public void execute() {
        receiver.makeDrink(drinkName);
    }

    @Override
    public void undo() {
        receiver.stopMakeDrink(drinkName);
    }
}
