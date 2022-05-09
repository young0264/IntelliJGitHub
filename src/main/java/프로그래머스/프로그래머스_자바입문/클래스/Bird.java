package 프로그래머스.프로그래머스_자바입문.클래스;

public abstract class Bird {
    public abstract void sing();//추상메서드가되면 클래스를 추상클래스로
    public void fly(){
        System.out.println("날다.");

    }
}
