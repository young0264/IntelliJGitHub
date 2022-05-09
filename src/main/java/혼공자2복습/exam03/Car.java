package 혼공자2복습.exam03;

public class Car {
    int speed;
    void run(){
        System.out.println(speed + "으로 달림다");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speed = 60;
        myCar.run();
    }
}
