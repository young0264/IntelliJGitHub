package 프로그래머스.프로그래머스_자바입문.변수_상수_타입변환;

public class 상수_06 {
    public static void main(String[] args){
        int i;
        i = 10;
        i = 5;

        final int J ;
        J = 10;
//        J = 5;  //이게 불가능
        double circleArea;
        final double PI = 3.14159;  //코드를 읽기도 좋고, 실수도 줄일수있고
        circleArea = 3*3*PI;

        final int OIL_PRICE = 1450; //이 가격부분만 바꿔주면 상수를 사용하면 편하게

        int totalPrice = 50 * OIL_PRICE;
        System.out.println(i);




    }

}
