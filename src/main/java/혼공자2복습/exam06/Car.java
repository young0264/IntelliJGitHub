package 혼공자2복습.exam06;

public class Car {
    //Field
    String model;
    int speed;

    //Constructor
    Car(String model){
        this.model = model;
    }

    void setSpeed(int speed){
        this.speed = speed;
    }

    void run(){
        for(int i=10;i<=50;i+=10){
            setSpeed(i);
            System.out.println(model + "가 달립니다. 시속:" + speed + "km/h");
        }
    }


}
