package 혼공자.sec06;

public class MyClassExam {
    public static void main(String[] args) {
        System.out.println("1)--------------------------------");

        MyClass myClass1 = new MyClass();
        myClass1.rc.turnOn();
        myClass1.rc.setVolume(5);

        System.out.println("2)--------------------------------");
        MyClass myClass2 = new MyClass(new Audio());

    }
}
