package Observer;

// Subject
public interface Subject {
    void registerStudent(Observer student);
    void removeStudent(Observer student);
    void Notify(); // 通知学生最新的时间
}
