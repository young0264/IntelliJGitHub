package 프로그래머스.프로그래머스_자바입문.연산자;

public class 산술연산자_09 {
    public static void main(String[] args){
        int i1 = -5;
        int i2 = +i1;
        int i3 = -i1; // 5
        int i4 = ++i3;
        int i5 = i3++; //피연산자에 i5에 값이 먼저 들어가고 i3이 증가함.
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i3++);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);

        //산술연산자
        int i = 5;
        int j = 2;
        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i*j);
        System.out.println(i/j);
        System.out.println(i/(float)j);
        System.out.println((float)i/j);











    }
}
