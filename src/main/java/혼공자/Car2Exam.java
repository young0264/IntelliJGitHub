package 혼공자;

public class Car2Exam {
    public static void main(String[] args) {
        Car2 myCar = new Car2();
        myCar.keyTurnOn();
        myCar.run();
        int speed = myCar.getSpeed();
        System.out.println("현재속도 : " + speed);
    }
}
