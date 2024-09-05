package Observer;

import java.util.ArrayList;
import java.util.List;

public class Clock implements Subject {

    private List<Observer> studentList = new ArrayList<>();
    private int CurrentTime = 0;

    @Override
    public void registerStudent(Observer student) {
        studentList.add(student);
    }

    @Override
    public void removeStudent(Observer student) {
        studentList.remove(student);
    }

    @Override
    public void Notify() {
        // 更新时间并通知全部学生
        for(var s: studentList){
            s.update(CurrentTime);
        }
    }

    public void setCurrentTime(int time){
        CurrentTime = time;
    }

    public int getCurrentTime(){
        return CurrentTime;
    }

}
