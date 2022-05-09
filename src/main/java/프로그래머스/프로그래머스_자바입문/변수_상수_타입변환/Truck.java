package 프로그래머스.프로그래머스_자바입문.변수_상수_타입변환;

public class Truck extends Car {
    public Truck(){
        //super("소방차");//자동으로 부모의생성자인 Car까지 호출이 됨
        System.out.println("Truck의 기본 생성자 입니다.");
    }
}



//나를가르키는건 this, 부모는 super