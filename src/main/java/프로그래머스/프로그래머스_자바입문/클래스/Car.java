package 프로그래머스.프로그래머스_자바입문.클래스;

public class Car {
    //타입 필드명, 변수 선언
    String name;
    int number;

    public Car(String name){ //Car 객체에 String타입으로 받겠다

        this.name = name;
    }

    public Car(){
        //this.name = "이름없음";
        //this.number = 0;
        this("이름없음",0); //this.타입에 맞는 자기자신을 호출


    }
    public Car(String name, int number){
        this.name = name;
        this.number = number;

    }

    public void run() {
        System.out.println("달려.");
    }
}
