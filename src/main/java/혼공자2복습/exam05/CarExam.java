package 혼공자2복습.exam05;

public class CarExam {
    public static void main(String[] args) {//실행하기위해 메인메서드 선언

        Car myCar = new Car(); // 객체를 먼저 생성
        //myCar. //mycar가 참조하는 객체에 접근을해서
        System.out.println("제작회사 : " + myCar.company);
        System.out.println("모델명 : " + myCar.model);
        System.out.println("색깔 : " + myCar.color);
        System.out.println("최고속도 : " + myCar.maxSpeed);
        System.out.println("현재속도 : " + myCar.speed);
        myCar.speed = 77;
        System.out.println("현재속도 : " + myCar.speed);


    }
}
