package 혼공자2복습.exam01;

public class Calculator {
    //Field
    //Constructor
    //Method
    void powerOn(){
        System.out.println("전원을 켭니다.");
    }
    int plus(int x , int y){
        return (x+y);
    }

    double divide(int x, int y){
        double result = (double) x / (double) y ;
        return result;
    }
    void powerOff(){
        System.out.println("전원을 끕니다.");
    }


}
