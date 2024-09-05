package Observer;

public interface Observer {
    void registerClock();
    void quitClock(); //类似removeClock()
    void update(int time);
}
