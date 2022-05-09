package 혼공자2복습.exam02;

public class Computer extends Calculator{
    @Override
    double areaCircle(double r) {
        System.out.println("Comp객체의 areaC실행");
        return Math.PI*r*r;
    }
}
