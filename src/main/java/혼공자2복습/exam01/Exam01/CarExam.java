package 혼공자2복습.exam01.Exam01;

public class CarExam {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(60);
        System.out.println(myCar.getSpeed());

        if(!myCar.isStop()){
            myCar.setStop(true);
        }
        System.out.println(myCar.getSpeed());

    }
}
