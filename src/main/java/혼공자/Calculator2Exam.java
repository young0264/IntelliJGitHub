package 혼공자;

public class Calculator2Exam {
    public static void main(String[] args) {
        Calculator2 myCalcu = new Calculator2();

        double result1 = myCalcu.areaRectangle(10);
        double result2 = myCalcu.areaRectangle(10,20);

        System.out.println(result1);
        System.out.println(result2);
    }
}
