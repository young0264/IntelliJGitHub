package 혼공자2복습.exam05;

public class Car1Exam {
    public static void main(String[] args) {
        Car1 myCar = new Car1();
        myCar.keyTurnOn();
        myCar.run();
        int speed = myCar.getSpeed();
        System.out.println("현재속도"+speed+"임다");
    }
}
