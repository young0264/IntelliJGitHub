package 프로그래머스.프로그래머스_자바입문.클래스;

public class 메소드사용해보기_29 {
    public static void main(String[] args){
        메소드_28 myclass = new 메소드_28();
        myclass.method1();
        myclass.method2(10);
        int value = myclass.method3();
        System.out.println("m3이 리턴한 값"+ value);
        myclass.method4(5,10);
        int value2 = myclass.method5(55);
        System.out.println("m5가 리턴한 값:" + value2);
    }
}
