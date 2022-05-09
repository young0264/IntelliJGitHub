package 혼공자;

public class Car4Exam {

    public static void main(String[] args) {
        Car4 myCar = new Car4();

        myCar.setSpeed(-50);

        System.out.println("현재속도: " + myCar.getSpeed());
        myCar.setSpeed(60);
        System.out.println(myCar.getSpeed());

        if(!myCar.isStop()){
            myCar.setStop(true);
        }

        System.out.println("현재속도 : " + myCar.getSpeed());
    }
}
