package 혼공자2복습.exam01;

public class CalculatorExam {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.powerOn();
        int value1 = (myCalc.plus(1,3));
        System.out.println("value1의 값은 : " + value1);

        byte x=10;
        byte y=4;
        double value2 = myCalc.divide(x,y);
        System.out.println("value2의 값은 : " + value2);
        myCalc.powerOff();
    }

}
