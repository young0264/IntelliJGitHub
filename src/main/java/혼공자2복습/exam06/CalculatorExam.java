package 혼공자2복습.exam06;
public class CalculatorExam {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();

        double result1 = myCal.areaRectangle(10);
        double result2 = myCal.areaRectangle(10,20);

        System.out.println(result1);
        System.out.println(result2);
    }
}
