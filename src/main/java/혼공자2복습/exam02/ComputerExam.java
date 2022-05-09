package 혼공자2복습.exam02;

public class ComputerExam {
    public static void main(String[] args) {
        int r = 10;
        Calculator calculator = new Calculator();
        System.out.println("원의면적"+calculator.areaCircle(r));

        Computer computer = new Computer();
        System.out.println("Co원면적"+computer.areaCircle(r));
    }
}
