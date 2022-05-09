package 혼공자;

public class Car2 {
    int speed; //필드

    //생성자?

    int getSpeed(){ //메소드
        return speed;
    }

    void keyTurnOn(){
        System.out.println("키를돌립니다.");
    }

    void run(){
        for(int i=10; i<=50; i+=10){
            speed=i;
            System.out.println("달립니다.(시속: "+speed+"km/h");
        }
    }
}
