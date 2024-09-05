package ChainofResponsibility;

public class Leaders implements Handler{

    private String postName;

    private int maximumTime;

    private Handler nextHandler;

    public Leaders(String postName, int maximumTime){
        this.postName = postName;
        this.maximumTime = maximumTime;
    }

    @Override
    public void handleRequest(int time) {
        if(time <= maximumTime){
            System.out.println("Approved by: "+ postName);
            return ;
        }
        if(nextHandler!=null){
            nextHandler.handleRequest(time);
            return;
        }

        System.out.println("Denied! ");
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public Handler getNextHandler() {
        return nextHandler;
    }
}
