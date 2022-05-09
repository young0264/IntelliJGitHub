package 혼공자2복습.exam01;

public class Singleton {//객체가 하나만 만들어지도록
    private static Singleton singleton = new Singleton();
    private Singleton(){}

    static Singleton getInstance(){
        return singleton;
    }

}
