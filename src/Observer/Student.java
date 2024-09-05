package Observer;

public class Student implements Observer {

    // 接口中只有抽象方法，像这些实例变量在具体实现中再写
    private String name;
    private int state; // 千万不能static呀，要不然所有学生共享一个state就麻烦了

    public Student(String str){
        name = str;
        state = -1;
    }

    @Override
    public void registerClock() {
        state = 1;
    }

    @Override
    public void quitClock() {
        state = 0;
    }

    @Override
    public void update(int time) {
        if(state==1){
            System.out.println(name+" "+ time);
        }
    }
}
