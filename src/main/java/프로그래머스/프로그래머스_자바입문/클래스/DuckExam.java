package 프로그래머스.프로그래머스_자바입문.클래스;

public class DuckExam {
    public static void main(String[] args){
        Duck duck = new Duck();
        duck.sing();
        duck.fly();

        //Bird b = new Bird(); 추상클래스를 이용해서 객체를 생성하는건 안돼
    }
}
