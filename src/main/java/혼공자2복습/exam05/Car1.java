package 혼공자2복습.exam05;

public class Car1 {
    //Field
    int speed;
    //Constructor
    //Method
    int getSpeed(){
        return speed;
    }

    void keyTurnOn(){
        System.out.println("키를돌립니다.");
    }

    void run(){
        for(int i=0; i<=50;i+=10){
            speed = i;
            System.out.println("현재스피드 : " +i+"입니다.");
        }
    }
}
