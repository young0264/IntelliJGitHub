package 혼공자.변수와타입;

public class 정수실수연산_자동타입변환 {
    public static void main(String[] args){
        byte x = 10;
        byte y = 20;
        int result = x + y;

        byte x2 = 30;
        long y2 = 40;

        int a = 1;
        int b = 2;



        int result2 = (int) (x2 + y2);
        long result3 = x2 + (int)y2;
        double result4 =(double) a/ b;
        double result5 = a/2.0;
        System.out.println(result5);
    }
}
