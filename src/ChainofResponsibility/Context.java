package ChainofResponsibility;

public class Context {

    private final Leaders supervisor = new Leaders("Supervisor",3);
    private final Leaders manager = new Leaders("Manager",7);
    private final Leaders director = new Leaders("Director",10);

    public Leaders getChainStart(){
        return supervisor;
    }

    public void setNext(){
        supervisor.setNextHandler(manager);
        manager.setNextHandler(director);
    }
}
